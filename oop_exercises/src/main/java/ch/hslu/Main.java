package ch.hslu;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        TemperatureInfo.printCompleteInfo(temperature);

        temperature.addKelvin(250.00f);
        TemperatureInfo.printCompleteInfo(temperature);

        temperature.addKelvin(50.00f);
        TemperatureInfo.printCompleteInfo(temperature);

        temperature.addKelvin(-300.00f);
        TemperatureInfo.printCompleteInfo(temperature);

        temperature.addKelvin(-300.00f);
        TemperatureInfo.printCompleteInfo(temperature);




    }
}
