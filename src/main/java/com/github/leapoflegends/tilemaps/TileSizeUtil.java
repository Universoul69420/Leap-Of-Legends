package com.github.leapoflegends.tilemaps;

public class TileSizeUtil {
    private static int tileSize;

    public static void setTileSize(int size) {
        tileSize = size;
    }

    public static int getTileSize() {
        return tileSize;
    }
}