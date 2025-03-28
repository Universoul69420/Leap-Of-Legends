package com.github.leapoflegends;

import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.Size;
import com.github.leapoflegends.scenes.game.*;
import com.github.leapoflegends.scenes.text.*;

public class MainGame extends YaegerGame {



    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void setupGame() {
        setGameTitle("Leap of Legends");
        setSize(new Size(800, 640));
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
    }
}
