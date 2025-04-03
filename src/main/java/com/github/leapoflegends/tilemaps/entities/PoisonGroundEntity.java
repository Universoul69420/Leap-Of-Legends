package com.github.leapoflegends.tilemaps.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class PoisonGroundEntity extends SpriteEntity implements Collider {
    public PoisonGroundEntity(final Coordinate2D location, final Size size, final Size tileSize) {
        super("sprites/poisongrass.png", location, tileSize);
    }
}