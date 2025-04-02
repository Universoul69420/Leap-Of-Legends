package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.leapoflegends.MainGame;

public class Level2Scene extends DynamicScene {
    private MainGame game;

    public Level2Scene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {

        MainGame.currentLevel = 2;
    }

    @Override
    public void setupEntities() {

    }
}
