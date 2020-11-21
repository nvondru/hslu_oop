package ch.hslu.sw_10.temperature;

import ch.hslu.SW_09.Temperature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureAppController temperatureAppController = new TemperatureAppController();
        temperatureAppController.startApp();
    }
}
