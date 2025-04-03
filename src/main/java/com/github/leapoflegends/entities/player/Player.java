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
import com.github.leapoflegends.entities.obstacle.Obstacle;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.TileSizeUtil;
import com.github.leapoflegends.tilemaps.entities.BushObstacleEntity;
import com.github.leapoflegends.tilemaps.entities.GroundEntity;
import com.github.leapoflegends.tilemaps.entities.LavaSourceEntity;
import com.github.leapoflegends.tilemaps.entities.LevelFinishEntity;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class Player extends DynamicSpriteEntity implements TimerContainer, Collided, Newtonian, SceneBorderTouchingWatcher, KeyListener {
    private int health = 100;
    private final MainGame game;
    private final HealthText healthText;
    private boolean jumpCooldown = false;
    private boolean isOnGround = false;
    private boolean contact = false;

    public Player(Coordinate2D location, HealthText healthText, MainGame game) {
        super("sprites/player.png", location, new Size(20, 19), 1, 2);
        this.game = game;
        this.healthText = healthText;
        healthText.setText(health);

        setGravityConstant(0.055);
        setFrictionConstant(0.04);
    }

    @Override
    public void onCollision(List<Collider> colliders) {

        for (Collider collider : colliders) {
            if (collider instanceof GroundEntity) {
                handleGroundCollision((GroundEntity) collider);
                contact = true;
            }
            if (collider instanceof Enemy) {
                health -= ((Enemy) collider).getDamage();
                healthText.setText(health);
                if (health == 0) {
                    game.setActiveScene(4);
                }
            }
            if (collider instanceof LevelFinishEntity) {
                game.setActiveScene(2);
            }
            if (collider instanceof BushObstacleEntity) {
                health -= 50;
                ((BushObstacleEntity) collider).remove();
                healthText.setText(health);
                if (health == 0) {
                    game.setActiveScene(4);
                }
            }
        }
    }

    private void handleGroundCollision(GroundEntity ground) {
        var playerBox = getBoundingBox();
        var groundBox = ground.getBoundingBox();

        double overlapX = Math.min(playerBox.getMaxX() - groundBox.getMinX(), groundBox.getMaxX() - playerBox.getMinX());
        double overlapY = Math.min(playerBox.getMaxY() - groundBox.getMinY(), groundBox.getMaxY() - playerBox.getMinY());

        if (overlapX < overlapY) {
            if (playerBox.getMaxX() > groundBox.getMinX() && playerBox.getMinX() < groundBox.getMinX()) {
                setAnchorLocationX(groundBox.getMinX() - getWidth() - 1);
                System.out.println("xmaxplayer: " + playerBox.getMaxX());
                System.out.println("xminplayer: " + playerBox.getMinX());
                System.out.println("Xmaxground: " + groundBox.getMaxX());
                System.out.println("XmINground: " + groundBox.getMinX());
                System.out.println("Ymaxplayer: " + playerBox.getMaxY());
                System.out.println("Yminplayer: " + playerBox.getMinY());
                System.out.println("Ymaxground: " + groundBox.getMaxY());
                System.out.println("YmINground: " + groundBox.getMinY());

            } else if (playerBox.getMinX() < groundBox.getMaxX() && playerBox.getMaxX() > groundBox.getMaxX()) {
                setAnchorLocationX(groundBox.getMaxX() + 1);
                System.out.println("Collision detected: Right");
            }
        } else {
            if (playerBox.getMaxY() > groundBox.getMinY() && playerBox.getMinY() < groundBox.getMinY()) {
                setAnchorLocationY(groundBox.getMinY() - 20.3);
                isOnGround = true; // Set isOnGround to true when a top collision is detected
                jumpCooldown = false; // Reset jump cooldown
                System.out.println("Collision detected: Top");
                setMotion(0, 0); // Reset vertical speed
            } else if (playerBox.getMinY() < groundBox.getMaxY() && playerBox.getMaxY() > groundBox.getMaxY()) {
                setAnchorLocationY(groundBox.getMaxY() + 2);
                System.out.println("Collision detected: Bottom");
                setMotion(0, 0); // Reset vertical speed
            }
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        if (sceneBorder == SceneBorder.LEFT) {
            setAnchorLocationX(0);
        } else if (sceneBorder == SceneBorder.TOP) {
            setAnchorLocationY(0);
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
            if (keys.contains(KeyCode.S)) {
                setMotion(2, 270);
            }

            if (keys.contains(KeyCode.SPACE)) {
                if (!jumpCooldown) {
                    double currentSpeed = (getSpeed() * 2);
                    double currentDirection = getDirection();
                    double jumpSpeed = 8;
                    double jumpDirection = 180;

                    double combinedSpeed = Math.sqrt(Math.pow(currentSpeed, 2) + Math.pow(jumpSpeed, 2));
                    double combinedDirection = Math.toDegrees(Math.atan2(Math.sin(Math.toRadians(jumpDirection)) * jumpSpeed + Math.sin(Math.toRadians(currentDirection)) * currentSpeed,
                            Math.cos(Math.toRadians(jumpDirection)) * jumpSpeed + Math.cos(Math.toRadians(currentDirection)) * currentSpeed));

                    setMotion(combinedSpeed, combinedDirection);

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