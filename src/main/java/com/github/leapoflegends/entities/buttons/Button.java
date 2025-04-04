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

public class Button extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private int sceneId;
    private int levelScene;
    private boolean isLevelButton;
    MainGame game;
    Color color;

    public Button(Coordinate2D initialLocation, String text, int sceneId, MainGame game, int size, Color color, boolean isLevelButton) {
        super(initialLocation, text);
        this.game = game;
        this.isLevelButton = isLevelButton;
        this.color = color;

        if (isLevelButton) {
            this.levelScene = sceneId + 4;
            setText("Level " + sceneId);
            setFill(Color.MAROON);
            setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 40));
        } else {
            this.sceneId = sceneId;
            setFill(color);
            setFont(Font.font("Comic Sans MS", FontWeight.BOLD, size));
        }
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if (isLevelButton) {
            MainGame.currentLevel = levelScene - 3;
            game.setActiveScene(levelScene);
        } else {
            game.setActiveScene(sceneId);
        }
    }

    @Override
    public void onMouseExited() {
        setFill(color);
        setCursor(Cursor.DEFAULT);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.GRAY);
        setCursor(Cursor.OPEN_HAND);
    }
}