package concretes.temperatureconversion;

/*
 * This is my dollar to tl conversion app
 * which is from my lesson trainings.
 */

import abstracts.DemoApp;

import java.util.Scanner;

public class TemperatureConversionApp extends DemoApp {
    public TemperatureConversionApp() {
        super("Temperature Conversion Program");
    }

    // The main code will be executed when you run 'run()' method.
    @Override
    protected void program() {
        System.out.println("Enter the temperature as Fahrenheit (F): ");
        double temperatureAsFahrenheit = scanner.nextDouble();

        double result = (temperatureAsFahrenheit - 32) / 1.8;

        System.out.println("The temperature as centigrade is " + result);
    }
}
