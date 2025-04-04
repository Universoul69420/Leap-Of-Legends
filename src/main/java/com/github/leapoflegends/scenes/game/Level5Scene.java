package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.enemy.Snake;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.DeathText;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap5;

public class Level5Scene extends GameScene {

    public Level5Scene(MainGame game) {
        super(game);

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");
        MainGame.currentLevel = 5;
    }


    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        DeathText deathDisplay = new DeathText(new Coordinate2D(10, 50));
        Player player = new Player(new Coordinate2D(10, 420), healthDisplay, deathDisplay, GAME);
        Enemy snake = new Snake(new Coordinate2D(760, 260), new Coordinate2D(760, 260), 100, 1);
        Enemy snake2 = new Snake(new Coordinate2D(760, 400), new Coordinate2D(760, 400), 100, 1);
        addEntity(snake);
        addEntity(snake2);
        addEntity(player);
        addEntity(healthDisplay);
        addEntity(deathDisplay);
    }

    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap5();
        addTileMap(groundScreenMap);
    }
}