package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import javafx.scene.paint.Color;

public class GameCompleteScene extends TextScene {

    public GameCompleteScene(MainGame game) {
        super(game);
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/gamecompleted.png");
    }

    @Override
    public void setupEntities() {
        Button menuButton = new Button(new Coordinate2D(getWidth()/2 - 70, 420), "Menu", 0, GAME, 40, Color.WHITE, false);
        addEntity(menuButton);
    }
}