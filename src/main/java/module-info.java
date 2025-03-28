module leapoflegends {
    requires hanyaeger;
    requires jdk.compiler;

    exports com.github.leapoflegends;

    opens audio;
    opens backgrounds;
    opens sprites;
}
