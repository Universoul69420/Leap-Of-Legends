package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.enemy.Snake;
import com.github.leapoflegends.entities.enemy.Zombie;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.DeathText;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap2;

public class Level2Scene extends GameScene {

    public Level2Scene(MainGame game) {
        super(game);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 2;
    }


    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        DeathText deathDisplay = new DeathText(new Coordinate2D(10, 50));
        Player player = new Player(new Coordinate2D(10, 420), healthDisplay, deathDisplay, GAME);
        Enemy zombie = new Zombie(new Coordinate2D(760, 420), new Coordinate2D(760, 420), 100, 2);
        Enemy snake = new Snake(new Coordinate2D(649, 420), new Coordinate2D(760, 420), 100, 2);
        Enemy snake2 = new Snake(new Coordinate2D(760, 100), new Coordinate2D(760, 100), 100, 2);
        addEntity(snake);
        addEntity(snake2);
        addEntity(player);
        addEntity(healthDisplay);
        addEntity(deathDisplay);
        addEntity(zombie);
    }

    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap2();
        addTileMap(groundScreenMap);
    }
}