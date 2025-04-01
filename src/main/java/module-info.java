module leapoflegends {
    requires hanyaeger;
    requires jdk.compiler;

    exports com.github.leapoflegends;
    exports com.github.leapoflegends.tilemaps.entities;

    opens backgrounds;
    opens sprites;
}
