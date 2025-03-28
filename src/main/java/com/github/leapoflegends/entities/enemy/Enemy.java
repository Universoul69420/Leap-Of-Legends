package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Enemy extends DynamicSpriteEntity implements Collider {
    public int damage;
    protected Enemy(String resource, Coordinate2D initialLocation, int damage) {
        super(resource, initialLocation);
        this.damage = damage;
    }
}
