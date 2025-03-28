package com.github.leapoflegends.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class Player extends DynamicSpriteEntity implements Collider, Collided, Newtonian, SceneBorderTouchingWatcher, KeyListener {
    private int health;
    public double playerHeight = 32;

    public Player(Coordinate2D location) {
        super("FILENAME", location, new Size(16, 32), 1, 2);
        health = 100;
    }
    @Override
    public void onCollision(List<Collider> list) {

    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {

    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        if (set.contains(KeyCode.A)) {
            setMotion(2, 270);
        }
        if (set.contains(KeyCode.D)) {
            setMotion(2, 90);
        }
        if (set.contains(KeyCode.S)) {
            setMotion(2, 270);
        }
        if (set.contains(KeyCode.SPACE)) {
            setMotion(2, 0);
        }
    }
}
