package com.github.leapoflegends.scenes;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.tilemaps.GroundTileMap;

public class Level1Scene extends DynamicScene implements TileMapContainer {
    private MainGame game;

    public Level1Scene(MainGame game) {
        this.game = game;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/Background.png");
    }

    @Override
    public void setupEntities() {

    }

    public void setupTileMaps() {
        var groundScreenMap = new GroundTileMap();
        addTileMap(groundScreenMap);
    }
}
