package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Enemy extends DynamicSpriteEntity implements Collider, Collided, Newtonian {

    protected Enemy(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);

    }
}
