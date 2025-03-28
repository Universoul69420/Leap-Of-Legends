package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Enemy extends DynamicSpriteEntity {
    protected Enemy(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }
}
