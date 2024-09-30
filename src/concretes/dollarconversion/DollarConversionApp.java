package concretes.dollarconversion;

/*
 * This is my dollar to tl conversion app
 * which is from my lesson trainings.
 */

import abstracts.DemoApp;

import java.util.Scanner;

public class DollarConversionApp extends DemoApp {
    public DollarConversionApp() {
        super("Dollar To Tl Program");
    }

    private final static double DOLLAR_CURRENCY = 34.2;

    // The main code will be executed when you run 'run()' method.
    @Override
    protected void program() {
        System.out.print("Please enter the dollar amount you have: ");
        double dollarAmount = scanner.nextDouble();

        double tlAmount = dollarAmount * DOLLAR_CURRENCY;

        System.out.println("The equivalent amount in Turkish Lira is: " + tlAmount);
    }
}
