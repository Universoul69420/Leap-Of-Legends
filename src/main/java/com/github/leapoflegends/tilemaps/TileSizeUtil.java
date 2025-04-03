package com.github.leapoflegends.tilemaps;

import com.github.hanyaeger.api.Size;

public class TileSizeUtil {
    private static int tileSize;

    public static void setTileSize(int size) {
        tileSize = size;
    }

    public static int getTileSize() {
        return tileSize;
    }

    public static Size getCalculatedTileSize() {
        return new Size(tileSize, tileSize);
    }
}