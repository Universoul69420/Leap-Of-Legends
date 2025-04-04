package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.enemy.Zombie;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap1P2;
import com.github.leapoflegends.tilemaps.GroundTileMap2;
import com.github.leapoflegends.tilemaps.GroundTileMap2P2;

public class Level1Scene2 extends DynamicScene implements TileMapContainer {
    private final MainGame GAME;

    public Level1Scene2(MainGame GAME) {
        this.GAME = GAME;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 1;
    }

    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        Player player = new Player(new Coordinate2D(10, 420), healthDisplay, GAME);
        Enemy zombie = new Zombie(new Coordinate2D(760, 400), new Coordinate2D(760, 400), 100, 2);
        addEntity(player);
        addEntity(zombie);
        addEntity(healthDisplay);
    }

    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap1P2();
        addTileMap(groundScreenMap);
    }
}

