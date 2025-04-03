package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.leapoflegends.tilemaps.entities.GroundEntity;
import com.github.leapoflegends.tilemaps.entities.LavaSourceEntity;

import java.util.List;
public class Zombie extends Enemy {
    public Zombie(Coordinate2D initialLocation) {
        super("sprites/zombie.png", initialLocation, new Size(16, 32), 100);
        setMotion(2, Direction.LEFT);

    }

    @Override
    public void onCollision(List<Collider> collidingEntity) {
        for (Collider collider : collidingEntity) {
            if (collider instanceof GroundEntity) {
                setMotion(0, Direction.DOWN);
                setMotion(2, Direction.LEFT);
            }
            if (collider instanceof LavaSourceEntity) {
                setAnchorLocation(new Coordinate2D(800, 400));
            }
            else {
                setMotion(2, Direction.LEFT);
            }
        }
    }
    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        setAnchorLocation(new Coordinate2D(800, 400));
    }
}
