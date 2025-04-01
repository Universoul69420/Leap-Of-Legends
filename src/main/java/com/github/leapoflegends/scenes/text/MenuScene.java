package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.HowToPlayButton;
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
        var quitButton = new QuitButton(new Coordinate2D(400, 450), game);
        var how2Play = new HowToPlayButton(new Coordinate2D(600, 450),game);

        addEntity(quitButton);
        addEntity(how2Play);
    }
}
