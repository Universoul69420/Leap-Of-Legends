module leapoflegends {
    requires hanyaeger;
    requires jdk.compiler;
    requires java.desktop;
    requires java.logging;

    exports com.github.leapoflegends;
    exports com.github.leapoflegends.tilemaps.entities;

    opens backgrounds;
    opens sprites;
    exports com.github.leapoflegends.tilemaps;
    exports com.github.leapoflegends.tilemaps.entities.obstacle;
    exports com.github.leapoflegends.tilemaps.entities.level;
    exports com.github.leapoflegends.tilemaps.entities.colliding;
}
