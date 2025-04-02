package com.github.leapoflegends.entities.player;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.obstacle.Obstacle;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.entities.GroundEntity;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.List;
import java.util.Set;

public class Player extends DynamicSpriteEntity implements Collider, Collided, Newtonian, SceneBorderTouchingWatcher, KeyListener {
    private int health = 100;
    private final MainGame game;
    private final HealthText healthText;
    public double playerHeight = 32;

    public Player(Coordinate2D location, HealthText healthText, MainGame game) {
        super("sprites/player.png", location, new Size(16, 32), 1, 2);
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
                setMotion(0, 0);
                break;
            }
            if (collider instanceof Enemy) {
                game.setActiveScene(4);
            }
            else if (collider instanceof Obstacle) {
                health -= 50;
                healthText.setText(health);
                if (health == 0) {
                    game.setActiveScene(4);
                }
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
        if (keys.contains(KeyCode.A)) {
            setCurrentFrameIndex(0);
            setMotion(2, 270);
        }
        if (keys.contains(KeyCode.D)) {
            setCurrentFrameIndex(1);
            setMotion(2, 90);
        }
        if (keys.contains(KeyCode.S)) {
            setMotion(2, 270);
        }
        if (keys.contains(KeyCode.SPACE)) {
            setMotion(2, 180);
            setGravityConstant(0.055);
        }
    }
}