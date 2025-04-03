package com.github.leapoflegends.tilemaps.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class BushObstacleEntity extends SpriteEntity implements Collider {
    public BushObstacleEntity(Coordinate2D initialLocation, final Size size) {
        super("sprites/bush.png", initialLocation, size);
    }
}