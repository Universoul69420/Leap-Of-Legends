package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.leapoflegends.tilemaps.entities.BlockEntity;
import com.github.leapoflegends.tilemaps.entities.LavaSourceEntity;

import java.util.List;
public class Snake extends Enemy {
    private Coordinate2D respawnLocation;
    private int speed;
    public Snake(Coordinate2D initialLocation, Coordinate2D respawnLocation, int speed) {
        super("sprites/snake.png", initialLocation, new Size(32, 16), 60);
        setMotion(speed, Direction.LEFT);
        setGravityConstant(0.055);
        setFrictionConstant(0.04);
        this.respawnLocation = respawnLocation;
        this.speed = speed;
    }

    @Override
    public void onCollision(List<Collider> collidingEntity) {
        for (Collider collider : collidingEntity) {
            if (collider instanceof BlockEntity) {
                setMotion(0, Direction.DOWN);
                setMotion(2, Direction.LEFT);
            }
            if (collider instanceof LavaSourceEntity) {
                setAnchorLocation(respawnLocation);

            } else if (collider instanceof Snake || collider instanceof Zombie) {

            } else {
                setMotion(speed, Direction.LEFT);
            }
        }
    }
    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        setAnchorLocation(respawnLocation);
    }
}