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
    MainGame game;
    Color color;

    public Button(Coordinate2D initialLocation, String text, int sceneId, MainGame game, int size, Color color) {
        super(initialLocation, text);
        this.sceneId = sceneId;
        this.game = game;
        this.color = color;
        setFill(color);
        setFont(Font.font("Comic Sans MS", FontWeight.BOLD, size));
    }
    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        game.setActiveScene(sceneId);
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
