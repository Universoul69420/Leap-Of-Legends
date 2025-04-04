package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.ScrollableDynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Zombie;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap3P2;


public class Level3Scene2 extends ScrollableDynamicScene implements TileMapContainer {
    private MainGame game;
    double scroll = 0;
    private boolean jumpCooldown = false;
    private boolean isOnGround = false;
    private Player player;
    public Level3Scene2(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
        setSize(new Size(2000, 640));
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 3;
    }

    @Override
    public void setupEntities() {
        var healthDisplay = new HealthText(new Coordinate2D(10, 10));
        player = new Player(new Coordinate2D(100, 200), healthDisplay, game);
        addEntity(player, false);
        addEntity(healthDisplay, true);
    }

    @Override
    public void setupTileMaps() {
        var groundScreenMap = new GroundTileMap3P2();
        addTileMap(groundScreenMap);
    }

//    @Override
//    public void onPressedKeysChange(Set<KeyCode> keys) {
//        if (keys.contains(KeyCode.D) || keys.contains(KeyCode.A) || keys.contains(KeyCode.SPACE)) {
//            if (getPlayerAvX() >= 400 && getPlayerAvX() <= 1600) {
//                scroll = getPlayerAvX();
//            }
//            if (getPlayerAvX() < 400) {
//                scroll = 100;
//            }
//            if (getPlayerAvX() > 1600) {
//                scroll = 1800;
//            }
//            setHorizontalScrollPosition(scroll);
//        }
//    }

    public double getPlayerMaxX() {
        return player.getBoundingBox().getMaxX();
    }
    public double getPlayerMinX() {
        return player.getBoundingBox().getMinX();
    }
    public double getPlayerAvX() {
        return (getPlayerMaxX()+getPlayerMinX())/2;
    }

//    @Override
//    public void explicitUpdate(long l) {
//        setHorizontalScrollPosition(getPlayerAvX()-400);
//    }

//@Override
//public void onPressedKeysChange(Set<KeyCode> keys) {
//    if (isOnGround) {
//        if (keys.contains(KeyCode.A) && !keys.contains(KeyCode.SPACE)) {
//            scroll -= 4;
//            setHorizontalScrollPosition(scroll);
//        }
//        if (keys.contains(KeyCode.D) && !keys.contains(KeyCode.SPACE)) {
//            scroll += 4;
//            setHorizontalScrollPosition(scroll);
//        }
//        if (keys.contains(KeyCode.S)) {
//            scroll -= 4;
//            setHorizontalScrollPosition(scroll);
//        }
//    }
//    if (keys.contains(KeyCode.SPACE)) {
//        if (!jumpCooldown) {
//            double currentSpeed = (8);
//            double jumpSpeed = 8;
//
//            double combinedSpeed = Math.sqrt(Math.pow(currentSpeed, 2) + Math.pow(jumpSpeed, 2));
//            if (keys.contains(KeyCode.D)) {
//                scroll += 2;
//                setHorizontalScrollPosition(scroll);
//            }
//            if (keys.contains(KeyCode.A)) {
//                scroll -= 2;
//                setHorizontalScrollPosition(scroll);
//
//            }
//
//            isOnGround = false;
//            jumpCooldown = true;
//        }
//    }
//}
}
