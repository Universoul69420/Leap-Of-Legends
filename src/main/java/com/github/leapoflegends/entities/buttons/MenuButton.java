package com.github.leapoflegends.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.leapoflegends.MainGame;

public class MenuButton extends TextEntity {
    MainGame game;

    public MenuButton(Coordinate2D initialLocation, MainGame game) {
        super(initialLocation,
                "How to play?"
        );
        this.game = game;
    }
}
