package com.github.leapoflegends.tilemaps.entities.obstacle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class LavaObstacleEntity extends Obstacle implements Collider {
    public LavaObstacleEntity(Coordinate2D initialLocation, final Size size, final Size tileSize) {
        super("sprites/lava.png", initialLocation, size, tileSize, 100);
    }
}