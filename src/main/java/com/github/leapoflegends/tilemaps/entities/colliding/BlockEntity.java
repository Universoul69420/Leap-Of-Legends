package com.github.leapoflegends.tilemaps.entities.colliding;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class BlockEntity extends SpriteEntity implements Collider {
    public BlockEntity(String resource, final Coordinate2D location, final Size SIZE, final Size TILESIZE) {
        super(resource, location, TILESIZE);
    }
}