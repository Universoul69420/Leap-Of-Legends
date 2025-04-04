package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;


public class Snake extends Enemy {
    public Snake(Coordinate2D initialLocation, Coordinate2D respawnLocation, int damage, int speed) {
        super("sprites/snake.png", initialLocation, respawnLocation, new Size(32, 16), damage, speed);
        setMotion(speed, Direction.LEFT);
        setGravityConstant(0.055);
        setFrictionConstant(0.04);
    }
}