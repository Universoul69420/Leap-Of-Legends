package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.enemy.Snake;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap4;

public class Level4Scene extends GameScene {

    public Level4Scene(MainGame game) {
        super(game);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/purplebackground.png");
        MainGame.currentLevel = 4;
    }


    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        Player player = new Player(new Coordinate2D(10, 300), healthDisplay, GAME);
        Enemy snake = new Snake(new Coordinate2D(760, 400), new Coordinate2D(760, 400), 100, 2);
        addEntity(player);
        addEntity(snake);
        addEntity(healthDisplay);
    }

    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap4();
        addTileMap(groundScreenMap);
    }
}