package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import javafx.scene.paint.Color;

public class LevelCompletedScene extends TextScene {


    public LevelCompletedScene(MainGame game) {
        super(game);
    }
    @Override
    public void setupScene() {
    setBackgroundImage("backgrounds/levelcomplete.png");

    }

    @Override
    public void setupEntities() {
    Button nextLevelButton = new Button(new Coordinate2D(100, 440), "Play Next Level", MainGame.currentLevel+5, GAME, 32, Color.WHITE, false);
    Button menuButton = new Button(new Coordinate2D(100, 340), "Menu", 0, GAME, 32, Color.WHITE, false);

    addEntity(nextLevelButton);
    addEntity(menuButton);
    }
}
