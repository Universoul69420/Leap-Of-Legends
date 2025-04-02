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

public class QuitButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    MainGame game;

    public QuitButton(Coordinate2D initialLocation, MainGame game) {
        super(initialLocation, "QUIT");
        this.game = game;
        setFill(Color.BLACK);
        setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 32));
    }

    @Override
    public void onMouseExited() {
        setFill(Color.BLACK);
        setCursor(Cursor.DEFAULT);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.GRAY);
        setCursor(Cursor.OPEN_HAND);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        game.quit();
    }
}
