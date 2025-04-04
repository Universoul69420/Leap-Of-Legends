package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import com.github.leapoflegends.entities.buttons.LevelStartButton;
import javafx.scene.paint.Color;

public class LevelFailedScene extends TextScene {

    public LevelFailedScene(MainGame GAME) {
        super(GAME);
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/levelfailed.png");
    }

    @Override
    public void setupEntities() {
        var menu = new Button(new Coordinate2D(550, 360), "MENU", 0, GAME, 36, Color.BLACK, false);
        var retry = new Button(new Coordinate2D(550, 460), "Retry", MainGame.currentLevel+4, GAME, 36, Color.BLACK, false);
        addEntity(menu);
        addEntity(retry);
    }
}
