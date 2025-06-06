package com.github.leapoflegends.tilemaps.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

    public class DirtEntity extends SpriteEntity {

        public DirtEntity(final Coordinate2D location, final Size SIZE, final Size TILESIZE) {
            super("sprites/World-Tiles1.png", location, TILESIZE);
        }
    }