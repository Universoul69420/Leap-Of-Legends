package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class Wolf extends Enemy{
    public Wolf(Coordinate2D initialLocation) {
        super("sprites/zombie.png", initialLocation, new Size(16, 32));
    }

    @Override
    public void onCollision(List<Collider> list) {

    }
}
