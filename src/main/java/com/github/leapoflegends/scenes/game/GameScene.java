package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.leapoflegends.MainGame;

public abstract class GameScene extends DynamicScene implements TileMapContainer {
    final protected MainGame GAME;
    public GameScene(MainGame game) {
        this.GAME = game;
    }

    public abstract void setupScene();

    public abstract void setupEntities();

    public abstract void setupTileMaps();
}
