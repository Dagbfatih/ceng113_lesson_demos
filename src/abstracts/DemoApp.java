package abstracts;

import java.util.Scanner;

/*
 * This abstract class is to specify meta information of subclasses
 * and to run onBefore and onAfter hooks.
 */
public abstract class DemoApp implements BaseDemoApp {

    // 'Optionally' empty constructor
    public DemoApp() {
    }

    // 'Optionally' can get the application name
    // to write on console at the startup.
    public DemoApp(String appName) {
        this.appName = appName;
    }

    protected String appName = "Demo App";

    protected Scanner scanner = new Scanner(System.in);

    // That is where you need to put your codes in.
    // The codes in here will be executed after 'onBefore()' hook.
    protected abstract void program();

    // This is how is the flow of hooks and the main 'program()' method.
    public void run() {
        onBefore();
        program();
        onAfter();
    }

    private void onBefore() {
        System.out.println("| --------------------------------------------------------------");
        System.out.println("| Welcome to " + appName);
        System.out.println("| --------------------------------------------------------------\n");
    }

    private void onAfter() {
        System.out.println("\n| --------------------------------------------------------------");
        System.out.println("| End of the " + appName);
        System.out.println("| --------------------------------------------------------------");
    }
}

