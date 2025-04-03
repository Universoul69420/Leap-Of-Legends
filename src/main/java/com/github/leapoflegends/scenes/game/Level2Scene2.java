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
import com.github.leapoflegends.tilemaps.GroundTileMap1P2;
import com.github.leapoflegends.tilemaps.GroundTileMap2P2;

public class Level2Scene2 extends DynamicScene implements TileMapContainer {
    private final MainGame game;

    public Level2Scene2(MainGame game) {
        this.game = game;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 2;
    }


    @Override
    public void setupEntities() {
        var healthDisplay = new HealthText(new Coordinate2D(10, 10));
        var player = new Player(new Coordinate2D(10, 420), healthDisplay, game);
        Enemy zombie = new Zombie(new Coordinate2D(760, 400), new Coordinate2D(760, 400), 2);
        Enemy snake = new Snake(new Coordinate2D(460, 400), new Coordinate2D(760, 400), 3);
        addEntity(snake);
        addEntity(player);
        addEntity(zombie);
        addEntity(healthDisplay);
    }

    public void setupTileMaps() {
        var groundScreenMap = new GroundTileMap2P2();
        addTileMap(groundScreenMap);
    }
}