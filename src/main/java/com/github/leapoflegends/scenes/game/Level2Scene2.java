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
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.entities.text.DeathText;
import com.github.leapoflegends.tilemaps.GroundTileMap2P2;

public class Level2Scene2 extends GameScene {

    public Level2Scene2(MainGame game) {
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
        Enemy zombie = new Zombie(new Coordinate2D(760, 400), new Coordinate2D(760, 400), 100, 2);
        Enemy snake = new Snake(new Coordinate2D(460, 400), new Coordinate2D(760, 400), 100, 2);
        addEntity(snake);
        addEntity(player);
        addEntity(zombie);
        addEntity(healthDisplay);
        addEntity(deathDisplay);
    }

    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap2P2();
        addTileMap(groundScreenMap);
    }
}