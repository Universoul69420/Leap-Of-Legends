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

public class Level2Scene extends DynamicScene implements TileMapContainer {
    private final MainGame GAME;

    public Level2Scene(MainGame GAME) {
        this.GAME = GAME;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 2;
    }


    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        Player player = new Player(new Coordinate2D(10, 420), healthDisplay, GAME);
        Enemy zombie = new Zombie(new Coordinate2D(760, 420), new Coordinate2D(760, 420), 100, 2);
        Enemy snake = new Snake(new Coordinate2D(649, 420), new Coordinate2D(760, 420), 70, 2);
        Enemy snake2 = new Snake(new Coordinate2D(760, 100), new Coordinate2D(760, 100), 70, 2);
        addEntity(snake);
        addEntity(snake2);
        addEntity(player);
        addEntity(healthDisplay);
        addEntity(zombie);
    }

    public void setupTileMaps() {
        var groundScreenMap = new GroundTileMap2();
        addTileMap(groundScreenMap);
    }
}