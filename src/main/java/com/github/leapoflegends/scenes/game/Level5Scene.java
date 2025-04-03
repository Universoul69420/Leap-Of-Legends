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
import com.github.leapoflegends.tilemaps.GroundTileMap5;

public class Level5Scene extends DynamicScene implements TileMapContainer {
    private final MainGame game;

    public Level5Scene(MainGame game) {
        this.game = game;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background.png");
        MainGame.currentLevel = 5;
    }


    @Override
    public void setupEntities() {
        var healthDisplay = new HealthText(new Coordinate2D(10, 10));
        var player = new Player(new Coordinate2D(10, 420), healthDisplay, game);
        Enemy snake = new Snake(new Coordinate2D(760, 260), new Coordinate2D(760, 260), 1);
        Enemy snake2 = new Snake(new Coordinate2D(760, 400), new Coordinate2D(760, 400), 1);
        addEntity(snake);
        addEntity(snake2);
        addEntity(player);
        addEntity(healthDisplay);
    }

    public void setupTileMaps() {
        var groundScreenMap = new GroundTileMap5();
        addTileMap(groundScreenMap);
    }
}