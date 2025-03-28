package com.github.leapoflegends;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.Size;

public class MainGame extends YaegerGame {


    public static final int SCENE_SELECTION = 0;
    public static final int SCENE_GRASS_WORLD = 1;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void setupGame() {
        setGameTitle("Leap of Legends");
        setSize(new Size(800, 600));
    }


    @Override
    public void setupScenes() {

    }
}
