package com.github.leapoflegends.tilemaps.entities.level;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class LevelContinueEntity extends SpriteEntity implements Collider {
    public LevelContinueEntity(Coordinate2D initialLocation, final Size size, final Size tileSize) {
        super("sprites/portal.png", initialLocation, tileSize);
    }
}