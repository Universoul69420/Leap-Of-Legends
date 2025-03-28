package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;

public class Zombie extends Enemy{
    public Zombie(String resource, Coordinate2D initialLocation, int damage) {
        super(resource, initialLocation, damage);
    }
}
