package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Enemy;
import com.github.leapoflegends.entities.enemy.Zombie;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap1;
import com.github.leapoflegends.tilemaps.GroundTileMap1Part2;

public class Level1ScenePart2 extends DynamicScene implements TileMapContainer {
    private final MainGame game;

    public Level1ScenePart2(MainGame game) {
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
        var player = new Player(new Coordinate2D(500, 200), healthDisplay, game);
        Enemy zombie = new Zombie(new Coordinate2D(760, 400));
        addEntity(player);
        addEntity(healthDisplay);
        addEntity(zombie);
    }

    public void setupTileMaps() {
        var groundScreenMap = new GroundTileMap1Part2();
        addTileMap(groundScreenMap);
    }
}
