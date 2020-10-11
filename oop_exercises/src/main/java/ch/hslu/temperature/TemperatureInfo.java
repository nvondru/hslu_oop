package ch.hslu.temperature;

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
