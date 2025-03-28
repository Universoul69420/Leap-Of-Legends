package com.github.leapoflegends.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.scene.Node;

import java.util.List;
import java.util.Optional;

public class Player extends DynamicSpriteEntity implements Collider, Collided{
    private int health;

    public Player(Coordinate2D location) {
        super("FILENAME", location, new Size(16, 32), 1, 2);

    }
    @Override
    public void onCollision(List<Collider> list) {

    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}
