package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;
import javafx.scene.paint.Color;

public class GameCompleteScene extends StaticScene {
    private MainGame game;

    public GameCompleteScene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/gamecompleted.png");
    }

    @Override
    public void setupEntities() {
        Button menuButton = new Button(new Coordinate2D(getWidth()/2, 420), "Menu", 0, game, 40, Color.WHITE);
        addEntity(menuButton);
    }
}
