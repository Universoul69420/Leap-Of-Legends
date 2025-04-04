package com.github.leapoflegends.tilemaps.entities.obstacle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class Obstacle extends SpriteEntity implements Collider {
    private int damage;
    protected Obstacle(String resource, Coordinate2D initialLocation, Size SIZE, final Size TILESIZE, int damage) {
        super(resource, initialLocation, TILESIZE);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
