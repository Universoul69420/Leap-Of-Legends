package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.buttons.MenuButton;

public class HowToPlayScene extends StaticScene {
    private MainGame game;

    public HowToPlayScene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/menu_background");
    }

    @Override
    public void setupEntities() {
        var menuButton = new MenuButton(new Coordinate2D(getWidth()/2, getHeight()/2), game);
        addEntity(menuButton);
    }
}
