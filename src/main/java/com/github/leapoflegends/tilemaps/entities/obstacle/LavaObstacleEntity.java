package com.github.leapoflegends.tilemaps.entities.obstacle;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;


public class LavaObstacleEntity extends Obstacle {
    public LavaObstacleEntity(Coordinate2D initialLocation, final Size SIZE, final Size TILESIZE) {
        super("sprites/lava.png", initialLocation, SIZE, TILESIZE, 100);
    }
}