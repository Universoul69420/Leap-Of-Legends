package com.github.leapoflegends.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;

import java.util.Optional;

public class RetryButton extends Image implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private String s;
    public RetryButton(String image) {
    super(image);
    }

    @Override
    public void onMouseExited() {
        s = "";
    }

    @Override
    public void onMouseEntered() {
        s = "";
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}
