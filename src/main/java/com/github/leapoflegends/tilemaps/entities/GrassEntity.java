package com.github.leapoflegends.tilemaps.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

    public class GrassEntity extends SpriteEntity implements Collider {

        public GrassEntity(final Coordinate2D location, final Size size) {
            super("sprites/grass.png", location, size);
        }
    }
