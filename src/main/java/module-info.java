module leapoflegends {
    requires hanyaeger;
    requires jdk.compiler;

    exports com.github.leapoflegends;
    exports com.github.leapoflegends.tilemaps.entities;

    opens audio;
    opens backgrounds;
    opens sprites;
}
