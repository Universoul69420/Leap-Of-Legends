package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import javafx.scene.paint.Color;

public class LevelCompletedScene extends StaticScene {
    private MainGame game;

    public LevelCompletedScene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
    setBackgroundImage("backgrounds/levelcomplete.png");

    }

    @Override
    public void setupEntities() {
    var nextlevel = new Button(new Coordinate2D(100, 440), "Play Next Level", MainGame.currentLevel+5, game, 32, Color.WHITE);
    var menu = new Button(new Coordinate2D(100, 340), "Menu", 0, game, 32, Color.WHITE);

    addEntity(nextlevel);
    addEntity(menu);
    }
}
