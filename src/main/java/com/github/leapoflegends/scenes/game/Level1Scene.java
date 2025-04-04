package com.github.leapoflegends.scenes.game;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap1;

public class Level1Scene extends GameScene {

    public Level1Scene(MainGame game) {
        super(game);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 1;
    }

    @Override
    public void setupEntities() {
        HealthText healthDisplay = new HealthText(new Coordinate2D(10, 10));
        Player player = new Player(new Coordinate2D(10, 420), healthDisplay, GAME);
        addEntity(player);
        addEntity(healthDisplay);
    }

    public void setupTileMaps() {
        TileMap groundScreenMap = new GroundTileMap1();
        addTileMap(groundScreenMap);
    }
}