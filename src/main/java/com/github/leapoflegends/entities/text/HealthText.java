package com.github.leapoflegends.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.leapoflegends.MainGame;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HealthText extends TextEntity {
    public HealthText(Coordinate2D initialLocation) {
        super(initialLocation);

        setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 40));
        setFill(Color.BLACK);
    }

    public void setText(final int health) {
        setText("HP: " + health);
    }
}
