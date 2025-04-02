module leapoflegends {
    requires hanyaeger;
    requires jdk.compiler;
    requires java.desktop;

    exports com.github.leapoflegends;
    exports com.github.leapoflegends.tilemaps.entities;

    opens backgrounds;
    opens sprites;
}
