package com.github.leapoflegends.tilemaps.entities.colliding;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class GrassBlockEntity extends BlockEntity {

    public GrassBlockEntity(Coordinate2D location, final Size SIZE, final Size TILESIZE) {
        super("sprites/grass.png",location, SIZE, TILESIZE);
    }
}
