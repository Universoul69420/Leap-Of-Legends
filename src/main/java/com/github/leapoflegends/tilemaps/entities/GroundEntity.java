package com.github.leapoflegends.tilemaps.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.leapoflegends.MainGame;

public class GroundEntity extends SpriteEntity implements Collider {
    public GroundEntity(final Coordinate2D location, final Size size, final Size tileSize) {
        super("sprites/grass.png", location, size);
    }
}