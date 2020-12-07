package ch.hslu.sw_10.temperature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TemperatureAppController {

    private static final Logger LOG = LogManager.getLogger(TemperatureAppController.class);
    private String tempUserInput = "";
    private final Scanner scanner = new Scanner(System.in);
    private final TemperatureHistory temperatureHistory;

    //private class TemperatureHistoryListener implements TemperatureMinMaxListener{
    //    @Override
    //    public void temperatureMinMaxChange(TemperatureMinMaxEvent event) {
    //        if (event.getEventType().equals(TemperatureEvents.MAX)){
    //            handle_temperatureMaxChanged(event);
    //        }else if(event.getEventType().equals(TemperatureEvents.MIN)){
    //            handle_temperatureMinChanged(event);
    //        }
    //    }
    //
    //    private void handle_temperatureMaxChanged(TemperatureMinMaxEvent event) {
    //        LOG.info("The maximum temperature in the current TemperatureHistory has changed from " + event.getOldValue() + " to " + event.getNewValue());
    //    }
    //
    //    private void handle_temperatureMinChanged(TemperatureMinMaxEvent event) {
    //        LOG.info("The minimum temperature in the current TemperatureHistory has changed from " + event.getOldValue() + " to " + event.getNewValue());
    //    }
    //}

    public TemperatureAppController(){
        this.temperatureHistory = new TemperatureHistory();
//        this.temperatureHistory.addTemperatureMinMaxListener(new TemperatureHistoryListener());

        this.temperatureHistory.addTemperatureMinMaxListener(new TemperatureMinMaxListener() {
            @Override
            public void temperatureMinMaxChange(TemperatureMinMaxEvent event) {
                if (event.getEventType().equals(TemperatureEvents.MAX)){
                    handle_temperatureMaxChanged(event);
                }else if(event.getEventType().equals(TemperatureEvents.MIN)){
                    handle_temperatureMinChanged(event);
                }
            }
            private void handle_temperatureMaxChanged(TemperatureMinMaxEvent event) {
                LOG.info("The maximum temperature in the current TemperatureHistory has changed from " + event.getOldValue() + " to " + event.getNewValue());
            }

            private void handle_temperatureMinChanged(TemperatureMinMaxEvent event) {
                LOG.info("The minimum temperature in the current TemperatureHistory has changed from " + event.getOldValue() + " to " + event.getNewValue());
            }
        });

    }

    public void startApp(){
        do {
            askUserToSaveTemperature();
        } while (!tempUserInput.equals("exit"));
        LOG.info(this.temperatureHistory.getReport());
        System.out.println("Programm beendet.");
    }

    private void askUserToSaveTemperature(){
        System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
        tempUserInput = scanner.next();
        try {
            if (!tempUserInput.equals("exit")) {
                float value = Float.valueOf(tempUserInput);
                TemperatureScales temperatureScale = askUserForTemperatureScale();
                Temperature temperature = new Temperature(value, temperatureScale);
                saveTemperature(temperature);
            }
        }catch (NumberFormatException exception){
            System.out.println("Input '" + tempUserInput + "' is not a number. Please enter a valid number or 'exit' to terminate the program!");
            LOG.error("Input '" + tempUserInput + "' is not a number. Please enter a valid number or 'exit' to terminate the program!", tempUserInput);
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            LOG.error(exception.getMessage(), exception);
        }
    }

    private TemperatureScales askUserForTemperatureScale() {
        String userInput;
        do {
            System.out.println("Soll der Wert als kelvin (1), celsius (2) oder fahrenheit (3) gepseichert werden?");
            userInput = scanner.next();
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3"));

        if (userInput.equals("1")){
            return TemperatureScales.KELVIN;
        }else if(userInput.equals("2")){
            return TemperatureScales.CELSIUS;
        }else{
            return TemperatureScales.FAHRENHEIT;
        }
    }

    private void saveTemperature(Temperature temperature){
        temperatureHistory.add(temperature);
    }


}
