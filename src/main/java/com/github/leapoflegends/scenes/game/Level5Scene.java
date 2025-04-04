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
import com.github.leapoflegends.tilemaps.GroundTileMap2;
import com.github.leapoflegends.tilemaps.GroundTileMap3;
import com.github.leapoflegends.tilemaps.GroundTileMap5;

public class Level5Scene extends DynamicScene implements TileMapContainer {
    private final MainGame GAME;

    public Level5Scene(MainGame GAME) {
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
        Enemy snake = new Snake(new Coordinate2D(760, 260), new Coordinate2D(760, 260), 70, 1);
        Enemy snake2 = new Snake(new Coordinate2D(760, 400), new Coordinate2D(760, 400), 70, 1);
        addEntity(snake);
        addEntity(snake2);
        addEntity(player);
        addEntity(healthDisplay);
    }

    public void setupTileMaps() {
        GroundTileMap5 groundScreenMap = new GroundTileMap5();
        addTileMap(groundScreenMap);
    }
}