package projects.playground;

import abstracts.DemoApp;

public class PlayGround extends DemoApp {

    public PlayGround() {
        super("Playground");
    }

    @java.lang.Override
    protected void program() {
        System.out.printf("%.1f", 3.56);
    }
}
