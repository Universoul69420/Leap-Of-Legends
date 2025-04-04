package com.github.leapoflegends;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.Size;
import com.github.leapoflegends.scenes.game.*;
import com.github.leapoflegends.scenes.text.*;

public class MainGame extends YaegerGame {



    public static void main(String[] args) {
        launch(args);
    }
    public static int currentLevel = 1;
    public static float deathCounter = 0;
    public static int tileSize;
    public static Size getCalculatedTileSize() {
        return new Size(tileSize, tileSize);
    }

    @Override
    public void setupGame() {
        setGameTitle("Leap of Legends");
        setSize(new Size(800, 640));
        tileSize = 32;
    }


    @Override
    public void setupScenes() {
        addScene(0, new MenuScene(this));
        addScene(1, new HowToPlayScene(this));
        addScene(2, new LevelCompletedScene(this));
        addScene(3, new GameCompleteScene(this));
        addScene(4, new LevelFailedScene(this));

        addScene(5, new Level1Scene(this));
        addScene(6, new Level2Scene(this));
        addScene(7, new Level3Scene(this));
        addScene(8, new Level4Scene(this));
        addScene(9, new Level5Scene(this));

        addScene(10, new Level1Scene2(this));
        addScene(11, new Level2Scene2(this));
        addScene(12, new Level3Scene2(this));
        addScene(13, new Level4Scene2(this));
        addScene(14, new Level5Scene2(this));

        setActiveScene(0);
    }
}
