package com.github.leapoflegends.entities.obstacle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class Obstacle extends SpriteEntity implements Collider {
    protected Obstacle(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }
}
