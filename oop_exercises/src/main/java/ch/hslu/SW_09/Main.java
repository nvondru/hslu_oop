package ch.hslu.SW_09;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                String type;
                Scanner scanner2 = new Scanner(System.in);
                if (!input.equals("exit")) {
                    float value = Float.valueOf(input);
                    System.out.println("Eigegebener Wert: " + value);
                    do {
                        System.out.println("Soll der Wert als kelvin (1), celsius (2) oder fahrenheit (3) gepseichert werden?");
                        type = scanner2.next();
                        Temperature temperature = null;
                        if (type.equals("1")) {
                            temperature = new Temperature(value, TemperatureEnums.KELVIN);
                        } else if (type.equals("2")) {
                            temperature = new Temperature(value, TemperatureEnums.CELSIUS);
                        } else if (type.equals("3")) {
                            temperature = new Temperature(value, TemperatureEnums.FAHRENHEIT);
                        } else {
                            System.out.println("Ungültige Eingabe '" + type + "'. Bitte korrigieren Sie Ihre Eingabe!");
                        }
                        if (temperature != null){
                            System.out.println("Created temperature: " + temperature.toString());
                        }
                    } while (!type.equals("1") && !type.equals("2") && !type.equals("3"));
                }
            }catch (java.lang.NumberFormatException exception){
                System.out.println("Input '" + input + "' is not a number. Please enter a valid number or 'exit' to terminate the program!");
                LOG.error("Input '" + input + "' is not a number. Please enter a valid number or 'exit' to terminate the program!", input);
            }catch (java.lang.IllegalArgumentException exception){
                System.out.println(exception.getMessage());
                LOG.error(exception.getMessage(), exception);
            }
        } while (!input.equals("exit"));
        System.out.println("Programm beendet.");
    }
}
