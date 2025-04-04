package com.github.leapoflegends.tilemaps.entities.level;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class GameCompleteEntity extends SpriteEntity implements Collider {
    public GameCompleteEntity(Coordinate2D initialLocation, final Size SIZE, final Size TILESIZE) {
        super("sprites/portal.png", initialLocation, TILESIZE);
    }
}
