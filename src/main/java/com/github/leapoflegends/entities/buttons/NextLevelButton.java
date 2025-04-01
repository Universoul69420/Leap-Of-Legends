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

public class NextLevelButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    MainGame game;
    public NextLevelButton(Coordinate2D location, MainGame game) {
        super(location, "Play Level " + MainGame.currentLevel+1
        );
        this.game = game;
        setFill(Color.RED);
        setFont(Font.font("Aldo the Apache", FontWeight.BOLD, 22));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        MainGame.currentLevel++;
        int nextLevel = MainGame.currentLevel + 1;
        game.setActiveScene(MainGame.currentLevel);

    }

    @Override
    public void onMouseEntered() {
        setFill(Color.MAROON);
        setCursor(Cursor.CROSSHAIR);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.RED);
        setCursor(Cursor.DEFAULT);
    }
}
