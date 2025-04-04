package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.enemy.Snake;
import com.github.leapoflegends.entities.enemy.Zombie;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap3;
import com.github.leapoflegends.tilemaps.GroundTileMap5P2;

public class Level5Scene2 extends DynamicScene implements TileMapContainer {
    private final MainGame GAME;
    public Level5Scene2(MainGame GAME) {
        this.GAME = GAME;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");
        MainGame.currentLevel = 5;
    }


    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        Player player = new Player(new Coordinate2D(10, 420), healthDisplay, GAME);
        addEntity(player);
        addEntity(healthDisplay);
    }

    public void setupTileMaps() {
        GroundTileMap5P2 groundScreenMap = new GroundTileMap5P2();
        addTileMap(groundScreenMap);
    }
}