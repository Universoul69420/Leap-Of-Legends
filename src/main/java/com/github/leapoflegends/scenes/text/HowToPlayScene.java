package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.Button;

public class HowToPlayScene extends StaticScene {
    private MainGame game;

    public HowToPlayScene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/how2playback.png");
    }

    @Override
    public void setupEntities() {
        var menuButton = new Button(new Coordinate2D(10, 10), "MENU", 0, game, 30);
        addEntity(menuButton);
    }
}
