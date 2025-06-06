package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.DeathText;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap5P2;

public class Level5Scene2 extends GameScene {

    public Level5Scene2(MainGame game) {
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
        addEntity(player);
        addEntity(healthDisplay);
        addEntity(deathDisplay);
    }

    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap5P2();
        addTileMap(groundScreenMap);
    }
}