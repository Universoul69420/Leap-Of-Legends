package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import javafx.scene.paint.Color;

public class HowToPlayScene extends TextScene {

    public HowToPlayScene(MainGame game) {
        super(game);
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/how2playbackgnd.png");
    }

    @Override
    public void setupEntities() {
        Button menuButton = new Button(new Coordinate2D(10, 10), "MENU", 0, GAME, 30, Color.BLACK, false);
        addEntity(menuButton);
    }
}
