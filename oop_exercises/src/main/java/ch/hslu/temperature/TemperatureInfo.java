package ch.hslu.temperature;

/**
 * Helper class that provides static methods to print information about any passed in temperature objects.
 * @author Nicolas Vondru (nicolas.vondru@stud.hslu.ch)
 * @version 1.0
 */

public class TemperatureInfo {

    public static void printCelsius(Temperature temperature){
        System.out.println("Temperature in celsius is: " + temperature.getCelsius());
    }

    public static void printKelvin(Temperature temperature){
        System.out.println("Temperature in kelvin is: " + temperature.getKelvin());
    }

    public static void printFahrenheit(Temperature temperature){
        System.out.println("Temperature in fahrenheit is: " + temperature.getFahrenheit());
    }

    public static void printCompleteInfo(Temperature temperature){
        System.out.println("-------------");
        printCelsius(temperature);
        printKelvin(temperature);
        printFahrenheit(temperature);
        System.out.println("-------------");
    }
}
