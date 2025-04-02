package com.github.leapoflegends.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.leapoflegends.MainGame;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelStartButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    int levelScene;
    MainGame game;
    public LevelStartButton(Coordinate2D location, int levelId, MainGame game) {
        super(location, "Level " + levelId
        );
        levelScene = levelId+4;
        this.game = game;
        setFill(Color.MAROON);
        setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 40));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        MainGame.currentLevel = levelScene-3;
        game.setActiveScene(levelScene);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.BLACK);
        setCursor(Cursor.CROSSHAIR);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.MAROON);
        setCursor(Cursor.DEFAULT);
    }
}
