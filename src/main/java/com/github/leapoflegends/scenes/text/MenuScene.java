package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import com.github.leapoflegends.entities.buttons.LevelStartButton;
import com.github.leapoflegends.entities.buttons.QuitButton;
import javafx.scene.paint.Color;

public class MenuScene extends TextScene {

    public MenuScene(MainGame GAME) {
        super(GAME);
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/menubase.png");
    }

    @Override
    public void setupEntities() {
        Button how2Play = new Button(new Coordinate2D(542, 590), "HOW TO PLAY?", 1, GAME, 32, Color.BLACK, false);
        QuitButton quitButton = new QuitButton(new Coordinate2D(10, 590), GAME);
        Button level1 = new Button(new Coordinate2D(20, 400), "", 1, GAME, 40, Color.MAROON, true);
        Button level2 = new Button(new Coordinate2D(180, 400), "", 2, GAME, 40, Color.MAROON, true);
        Button level3 = new Button(new Coordinate2D(340, 400), "", 3, GAME, 40, Color.MAROON, true);
        Button level4 = new Button(new Coordinate2D(500, 400), "", 4, GAME, 40, Color.MAROON, true);
        Button level5 = new Button(new Coordinate2D(660, 400), "", 5, GAME, 40, Color.MAROON, true);
        addEntity(quitButton);
        addEntity(how2Play);
        addEntity(level1);
        addEntity(level2);
        addEntity(level3);
        addEntity(level4);
        addEntity(level5);
    }
}
