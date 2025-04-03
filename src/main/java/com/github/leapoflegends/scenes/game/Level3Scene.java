package com.github.leapoflegends.scenes.game;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.ScrollableDynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.leapoflegends.MainGame;
import com.github.leapoflegends.entities.enemy.Zombie;
import com.github.leapoflegends.entities.player.Player;
import com.github.leapoflegends.entities.text.HealthText;
import com.github.leapoflegends.tilemaps.GroundTileMap2;
import com.github.leapoflegends.tilemaps.GroundTileMap3;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class Level3Scene extends ScrollableDynamicScene implements TileMapContainer, KeyListener {
    private MainGame game;
    double scroll = 0;
    public Level3Scene(MainGame game) {
        this.game = game;
    }
    @Override
    public void setupScene() {
        setSize(new Size(2000, 640));
        setBackgroundImage("backgrounds/Background.png");
        MainGame.currentLevel = 3;
    }

    @Override
    public void setupEntities() {
        var healthDisplay = new HealthText(new Coordinate2D(10, 10));
        var player = new Player(new Coordinate2D(500, 200), healthDisplay, game);
        var zombie = new Zombie(new Coordinate2D(760, 400));
        addEntity(player, false);
        addEntity(healthDisplay, true);
    }

    @Override
    public void setupTileMaps() {
        var groundScreenMap = new GroundTileMap3();
        addTileMap(groundScreenMap);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> keys) {
        if (keys.contains(KeyCode.D)) {
            if (scroll <= 2396) {
                scroll += 5d;
            }
            setHorizontalScrollPosition(scroll);
            System.out.println(scroll);
        }
        if (keys.contains(KeyCode.A)) {
            if (scroll >= -396) {
                scroll -= 5;
            }
            setHorizontalScrollPosition(scroll);
            System.out.println(scroll);
        }
    }
}
