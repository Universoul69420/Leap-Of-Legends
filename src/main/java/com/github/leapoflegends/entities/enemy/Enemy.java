package com.github.leapoflegends.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.leapoflegends.tilemaps.entities.colliding.BlockEntity;
import com.github.leapoflegends.tilemaps.entities.obstacle.LavaObstacleEntity;

import java.util.List;

public abstract class Enemy extends DynamicSpriteEntity implements Collider, Collided, Newtonian,SceneBorderCrossingWatcher {
    private final int DAMAGE;
    private final Coordinate2D RESPAWNLOCATION;
    private final int SPEED;
    protected Enemy(String resource, Coordinate2D initialLocation, Coordinate2D RESPAWNLOCATION, Size size, int DAMAGE, int SPEED) {
        super(resource, initialLocation, size);
        this.DAMAGE = DAMAGE;
        this.RESPAWNLOCATION = RESPAWNLOCATION;
        this.SPEED = SPEED;
    }


    public void onCollision(List<Collider> collidingEntity) {
        for (Collider collider : collidingEntity) {
            if (collider instanceof BlockEntity) {
                setMotion(0, Direction.DOWN);
                setMotion(SPEED, Direction.LEFT);
            }
            if (collider instanceof LavaObstacleEntity) {
                setAnchorLocation(RESPAWNLOCATION);
            }
            else {
                setMotion(SPEED, Direction.LEFT);
            }
        }
    }


    public void notifyBoundaryCrossing(SceneBorder border) {
        setAnchorLocation(RESPAWNLOCATION);
    }

    public int getDamage() {
        return DAMAGE;
    }
}
