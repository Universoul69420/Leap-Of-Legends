package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import com.github.leapoflegends.entities.buttons.LevelStartButton;

public class LevelFailedScene extends StaticScene {
    private MainGame game;

    public LevelFailedScene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/levelfailed.png");
    }

    @Override
    public void setupEntities() {
        var menu = new Button(new Coordinate2D(550, 360), "MENU", 0, game, 36);
        var retry = new Button(new Coordinate2D(550, 460), "Retry", 5, game, 36);
        addEntity(menu);
        addEntity(retry);
    }
}
