package com.github.leapoflegends.tilemaps.entities.colliding;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class StoneBlockEntity extends BlockEntity{

    public StoneBlockEntity(Coordinate2D location, final Size SIZE, final Size TILESIZE) {
        super("sprites/stone.png", location, SIZE, TILESIZE);
    }
}
