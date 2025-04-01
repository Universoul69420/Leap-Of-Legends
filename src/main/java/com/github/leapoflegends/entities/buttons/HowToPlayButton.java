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

public class HowToPlayButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    MainGame game;

    public HowToPlayButton(Coordinate2D initialLocation, MainGame game) {
        super(initialLocation,
                "How to play?"
                );
        this.game = game;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        game.setActiveScene(1);
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
}
