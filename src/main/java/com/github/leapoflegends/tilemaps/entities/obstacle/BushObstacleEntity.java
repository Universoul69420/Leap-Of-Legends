package com.github.leapoflegends.tilemaps.entities.obstacle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;


public class BushObstacleEntity extends Obstacle {
    public BushObstacleEntity(Coordinate2D initialLocation, final Size SIZE, final Size TILESIZE) {
        super("sprites/bush.png", initialLocation, SIZE, TILESIZE, 50);
    }
}