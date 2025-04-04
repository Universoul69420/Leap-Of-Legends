package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import javafx.scene.paint.Color;

public class LevelFailedScene extends TextScene {

    public LevelFailedScene(MainGame game) {
        super(game);
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/levelfailed.png");
    }

    @Override
    public void setupEntities() {
        Button menuButton = new Button(new Coordinate2D(550, 360), "MENU", 0, GAME, 36, Color.BLACK, false);
        Button retryButton = new Button(new Coordinate2D(550, 460), "Retry", MainGame.currentLevel+4, GAME, 36, Color.BLACK, false);
        addEntity(menuButton);
        addEntity(retryButton);
    }
}
