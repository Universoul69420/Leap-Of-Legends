package com.github.leapoflegends.scenes.text;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.leapoflegends.MainGame;

public abstract class TextScene extends StaticScene {
    final protected MainGame GAME;

    public TextScene(MainGame GAME) {
        this.GAME = GAME;
    }

    public abstract void setupScene();
    public abstract void setupEntities();
}
