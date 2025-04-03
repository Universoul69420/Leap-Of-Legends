package com.github.leapoflegends.tilemaps.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class LavaSourceEntity extends SpriteEntity implements Collider {
    public LavaSourceEntity(Coordinate2D initialLocation, final Size size, final Size tileSize) {
        super("sprites/lava.png", initialLocation, tileSize);
    }
}