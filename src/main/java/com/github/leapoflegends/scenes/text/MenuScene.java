package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.HowToPlayButton;
import com.github.leapoflegends.entities.buttons.LevelStartButton;
import com.github.leapoflegends.entities.buttons.QuitButton;

public class MenuScene extends StaticScene {
    private MainGame game;

    public MenuScene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/menubase.png");
    }

    @Override
    public void setupEntities() {
        var quitButton = new QuitButton(new Coordinate2D(10, 590), game);
        var how2Play = new HowToPlayButton(new Coordinate2D(522, 590),game);
        var level1 = new LevelStartButton(new Coordinate2D(20, 400), 1, game);
        var level2 = new LevelStartButton(new Coordinate2D(180, 400), 2, game);
        var level3 = new LevelStartButton(new Coordinate2D(340, 400), 3, game);
        var level4 = new LevelStartButton(new Coordinate2D(500, 400), 4, game);
        var level5 = new LevelStartButton(new Coordinate2D(660, 400), 5, game);
        addEntity(quitButton);
        addEntity(how2Play);
        addEntity(level1);
        addEntity(level2);
        addEntity(level3);
        addEntity(level4);
        addEntity(level5);
    }
}
