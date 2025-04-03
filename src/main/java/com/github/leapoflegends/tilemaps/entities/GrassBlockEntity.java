package com.github.leapoflegends.tilemaps.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class GrassBlockEntity extends BlockEntity {

    public GrassBlockEntity(Coordinate2D location, Size size, Size tileSize) {
        super("sprites/grass.png",location, size, tileSize);
    }
}
