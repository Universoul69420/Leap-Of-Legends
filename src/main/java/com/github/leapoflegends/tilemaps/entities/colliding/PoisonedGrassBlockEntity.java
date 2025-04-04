package com.github.leapoflegends.tilemaps.entities.colliding;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class PoisonedGrassBlockEntity extends BlockEntity implements Collider {
    public PoisonedGrassBlockEntity(final Coordinate2D location, final Size size, final Size tileSize) {
        super("sprites/poisongrass.png", location, size, tileSize);
    }
}