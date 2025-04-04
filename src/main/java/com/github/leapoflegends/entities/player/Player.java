package com.github.leapoflegends.entities.player;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.Timer;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.entities.colliding.BlockEntity;
import com.github.leapoflegends.tilemaps.entities.level.GameCompleteEntity;
import com.github.leapoflegends.tilemaps.entities.obstacle.BushObstacleEntity;
import com.github.leapoflegends.tilemaps.entities.level.LevelContinueEntity;
import com.github.leapoflegends.tilemaps.entities.level.LevelFinishEntity;
import com.github.leapoflegends.tilemaps.entities.obstacle.Obstacle;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class Player extends DynamicSpriteEntity implements TimerContainer, Collided, Newtonian, SceneBorderTouchingWatcher, KeyListener {
    private int health = 100;
    private final MainGame game;
    private final HealthText healthText;
    private boolean jumpCooldown = false;
    private boolean isOnGround = false;

    public Player(Coordinate2D location, HealthText healthText, MainGame game) {
        super("sprites/player.png", location, new Size(32, 31), 1, 2);
        this.game = game;
        this.healthText = healthText;
        healthText.setText(health);

        setGravityConstant(0.075);
        setFrictionConstant(0.04);
    }

    @Override
    public void onCollision(List<Collider> colliders) {

        for (Collider collider : colliders) {
            if (collider instanceof BlockEntity) {
                handleGroundCollision((BlockEntity) collider);
            }
            if (collider instanceof Enemy) {
                health -= ((Enemy) collider).getDamage();
                healthText.setText(health);
                if (health <= 0) {
                    game.setActiveScene(4);
                }
            }
            if (collider instanceof Obstacle obstacle) {
                var playerBox = getBoundingBox();
                var obstacleBox = obstacle.getBoundingBox();

                boolean collisionX = playerBox.getMaxX() > obstacleBox.getMinX() &&
                        playerBox.getMinX() < obstacleBox.getMaxX();
                boolean collisionY = playerBox.getMaxY() > obstacleBox.getMinY() + 10 &&
                        playerBox.getMinY() < obstacleBox.getMaxY() + 10;

                if (collisionX && collisionY) {
                    health -= obstacle.getDamage();
                    healthText.setText(health);
                    if (collider instanceof BushObstacleEntity) {
                        ((BushObstacleEntity) collider).remove();
                    }
                    if (health <= 0) {
                        game.setActiveScene(4);
                    }
                }
            }
            if (collider instanceof LevelFinishEntity) {
                game.setActiveScene(2);
            }
            if (collider instanceof LevelContinueEntity) {
                game.setActiveScene(MainGame.currentLevel+9);
            }
            if (collider instanceof GameCompleteEntity) {
                game.setActiveScene(4);
            }
        }
    }

    private void handleGroundCollision(BlockEntity ground) {
        var playerBox = getBoundingBox();
        var groundBox = ground.getBoundingBox();

        double overlapX = Math.min(playerBox.getMaxX() - groundBox.getMinX(), groundBox.getMaxX() - playerBox.getMinX());
        double overlapY = Math.min(playerBox.getMaxY() - groundBox.getMinY(), groundBox.getMaxY() - playerBox.getMinY());

        if (overlapX < overlapY) {
            if (playerBox.getMaxX() > groundBox.getMinX() && playerBox.getMinX() < groundBox.getMinX()) {
                setAnchorLocationX(groundBox.getMinX() - getWidth() - 1);
                // Left Collision
            } else if (playerBox.getMinX() < groundBox.getMaxX() && playerBox.getMaxX() > groundBox.getMaxX()) {
                setAnchorLocationX(groundBox.getMaxX() + 1);
                // Right Collision
            }
        } else {
            if (playerBox.getMaxY() > groundBox.getMinY() && playerBox.getMinY() < groundBox.getMinY()) {
                setAnchorLocationY(groundBox.getMinY() - 31.3);
                isOnGround = true;
                jumpCooldown = false;
                setMotion(0, 0);
                // Top Collision
            } else if (playerBox.getMinY() < groundBox.getMaxY() && playerBox.getMaxY() > groundBox.getMaxY()) {
                setAnchorLocationY(groundBox.getMaxY() + 2);
                setMotion(0, 0);
                // Bottom Collision
            }
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        if (sceneBorder == SceneBorder.LEFT) {
            setAnchorLocationX(1);
        } else if (sceneBorder == SceneBorder.RIGHT) {
            setAnchorLocationX(getSceneWidth() - getWidth() - 1);
        } else if (sceneBorder == SceneBorder.TOP) {
            setAnchorLocationY(1);
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> keys) {
        if (isOnGround) {
            if (keys.contains(KeyCode.A) && !keys.contains(KeyCode.SPACE)) {
                setCurrentFrameIndex(0);
                setMotion(2, 270);
            }
            if (keys.contains(KeyCode.D) && !keys.contains(KeyCode.SPACE)) {
                setCurrentFrameIndex(1);
                setMotion(2, 90);
            }

            if (keys.contains(KeyCode.SPACE)) {
                if (!jumpCooldown) {
                    double jumpDirection = 180;

                    if (keys.contains(KeyCode.D)) {
                        setMotion(7, 140); // Jumping right
                    } else if (keys.contains(KeyCode.A)) {
                        setMotion(7, 215); // Jumping left
                    } else {
                        setMotion(6, jumpDirection); // Jumping up
                    }

                    isOnGround = false;
                    jumpCooldown = true;
                }

            }
        }
    }

    @Override
    public void setupTimers() {
        addTimer(new Timer(100) { // Timer that runs every 100 milliseconds
            @Override
            public void onAnimationUpdate(long timestamp) {
                isOnGround = false;
            }
        });
    }
}