package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Enemy extends DynamicSpriteEntity implements Collider, Collided, Newtonian,SceneBorderCrossingWatcher {
    private int damage;
    protected Enemy(String resource, Coordinate2D initialLocation, Size size, int damage) {
        super(resource, initialLocation, size);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
