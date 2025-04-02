package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.List;

public class Snake extends Enemy{
    public Snake(Coordinate2D initialLocation) {
        super("sprites/zombie.png", initialLocation, new Size(16, 32));
    }

    @Override
    public void onCollision(List<Collider> list) {

    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        setAnchorLocation(new Coordinate2D(800, 400));
    }
}
