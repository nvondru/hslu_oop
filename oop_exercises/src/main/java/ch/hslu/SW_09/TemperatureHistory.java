package ch.hslu.SW_09;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class TemperatureHistory {
    private final List< Temperature> history;
    private static final Logger LOG = LogManager.getLogger(TemperatureHistory.class);

    public TemperatureHistory() {
        this.history = new ArrayList<>();
    }

    public void add(final  Temperature temperature){
        if (temperature != null){
            this.history.add(temperature);
            LOG.info("Successfully created and saved temperature: " + temperature.toString());
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

    public  Temperature getMax(){
        return Collections.max(this.history);
    }

    public  Temperature getMin(){
        return Collections.min(this.history);
    }

    public  Temperature getAverage(){
        if (this.getCount() > 0){
            float temperatureSumInKelvin = 0f;
            for ( Temperature temperature : history){
                temperatureSumInKelvin += temperature.getKelvin();
            }
             Temperature average = Temperature.createFromKelvin(temperatureSumInKelvin / this.getCount());
            return average;
        }else{
            throw new NoSuchElementException("The average could not be calculated, because there are no elements saved in this TemperatureHistory object");
        }

    }

}
