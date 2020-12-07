package ch.hslu.sw_10.temperature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class TemperatureHistory {
    private final List<Temperature> history;
    private final List<TemperatureMinMaxListener> listeners = new ArrayList<>();
    private static final Logger LOG = LogManager.getLogger(TemperatureHistory.class);
    private Temperature maxTemperature;
    private Temperature minTemperature;

    public TemperatureHistory() {
        this.history = new ArrayList<>();
    }

    public void add(final Temperature temperature){
        if (temperature != null){
            this.history.add(temperature);
            LOG.info("Successfully created and saved temperature: " + temperature.toString());
        }

        if (this.maxTemperature == null || temperature.getKelvin() > this.maxTemperature.getKelvin()){
            TemperatureMinMaxEvent event = new TemperatureMinMaxEvent(this, TemperatureEvents.MAX, this.maxTemperature, temperature);
            this.maxTemperature = temperature;
            this.fireTemperatureMinMaxEvent(event);
        }

        if (this.minTemperature == null || temperature.getKelvin() < this.minTemperature.getKelvin()){
            TemperatureMinMaxEvent event = new TemperatureMinMaxEvent(this, TemperatureEvents.MIN, this.minTemperature, temperature);
            this.minTemperature = temperature;
            this.fireTemperatureMinMaxEvent(event);
        }
    }

    public void clear(){
        this.history.clear();
    }

    public int getCount(){
        try {
            return this.history.size();

        }catch (NullPointerException exception){
            LOG.error(exception.toString());
            return 0;
        }
    }

    public Temperature getMax(){
        if (this.maxTemperature == null){
            throw new NullPointerException("The max temperature is not set.");
        }else{
            return this.maxTemperature;
        }
    }

    public Temperature getMin(){
        if (this.minTemperature == null){
            throw new NullPointerException("The min temperature is not set.");
        }else{
            return this.minTemperature;
        }
    }

    public Temperature getAverage(){
        if (this.getCount() > 0){
            float temperatureSumInKelvin = 0f;
            for (Temperature temperature : history){
                temperatureSumInKelvin += temperature.getKelvin();
            }
            Temperature average = Temperature.createFromKelvin(temperatureSumInKelvin / this.getCount());
            return average;
        }else{
            throw new NoSuchElementException("The average could not be calculated, because there are no elements saved in this TemperatureHistory object");
        }

    }

    public String getReport(){
        String output = "------------------------------------------------\n";
        output += "Report for current TemperatureHistory at " + new Date().toString() + " : \n";
        output += "Saved temperatures: " + this.getCount() + "\n";
        output += "Average temperature: " + this.getAverage() + "\n";
        output += "Maximum temperature: " + this.getMax().toString() + "\n";
        output += "Minimum temperature: " + this.getMin().toString() + "\n";
        output += "------------------------------------------------" + "\n";
        return output;
    }

    public void addTemperatureMinMaxListener(TemperatureMinMaxListener listener){
        if (listener != null){
            this.listeners.add(listener);
        }
    }

    public void removeTemperatureMinMaxListener(TemperatureMinMaxListener listener){
        if (listener != null){
            this.listeners.remove(listener);
        }
    }

    private void fireTemperatureMinMaxEvent(TemperatureMinMaxEvent event){
        for (TemperatureMinMaxListener listener : this.listeners){
            listener.temperatureMinMaxChange(event);
        }
    }

}
