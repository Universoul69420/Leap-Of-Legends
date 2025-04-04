package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap3P2;


public class Level3Scene2 extends GameScene {

    public Level3Scene2(MainGame game) {
        super(game);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 3;
    }

    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        Player player = new Player(new Coordinate2D(10, 400), healthDisplay, GAME);
        addEntity(player);
        addEntity(healthDisplay);
    }

    @Override
    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap3P2();
        addTileMap(groundScreenMap);
    }
}
