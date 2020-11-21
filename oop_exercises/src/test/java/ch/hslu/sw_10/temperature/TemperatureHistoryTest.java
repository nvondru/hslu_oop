package ch.hslu.sw_10.temperature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureHistoryTest {
    private TemperatureHistory history;



    @BeforeEach
    void setUp() {
        history = new TemperatureHistory();
    }

    @Test
    public void checkGetCount(){
        assertEquals(0, history.getCount());
    }

    @Test
    public void checkAdd(){
        Temperature temperature = Temperature.createFromCelsius(30.5f);
        history.add(temperature);
        assertEquals(1, history.getCount());
    }

    @Test
    public void checkClear(){
        Temperature temperature1 = Temperature.createFromCelsius(30.5f);
        Temperature temperature2 = Temperature.createFromCelsius(0f);
        Temperature temperature3 = Temperature.createFromCelsius(-20f);

        history.add(temperature1);
        history.add(temperature2);
        history.add(temperature3);
        assertEquals(3, history.getCount());
        history.clear();
        assertEquals(0, history.getCount());
    }

    @Test
    public void checkGetMax(){
        Temperature temperatureMax = Temperature.createFromCelsius(30.5f);
        Temperature temperatureMid = Temperature.createFromCelsius(0f);
        Temperature temperatureMin = Temperature.createFromCelsius(-20f);

        history.add(temperatureMax);
        history.add(temperatureMid);
        history.add(temperatureMin);

        assertEquals(temperatureMax, history.getMax());
    }
    @Test
    public void checkGetMin(){
        Temperature temperatureMax = Temperature.createFromCelsius(30.5f);
        Temperature temperatureMid = Temperature.createFromCelsius(0f);
        Temperature temperatureMin = Temperature.createFromCelsius(-20f);

        history.add(temperatureMax);
        history.add(temperatureMid);
        history.add(temperatureMin);

        assertEquals(temperatureMin, history.getMin());
    }

    @Test
    public void checkGetAverage(){
        Temperature temperatureMax = Temperature.createFromCelsius(30f);
        Temperature temperatureMid = Temperature.createFromCelsius(20f);
        Temperature temperatureMin = Temperature.createFromCelsius(0f);

        //how do i test this properly?
        // do i need to respect delta in Temperature.equals() ?
        Temperature temperatureAverage = Temperature.createFromCelsius(16.666f);

        history.add(temperatureMax);
        history.add(temperatureMid);
        history.add(temperatureMin);

        assertEquals(temperatureAverage, history.getAverage());
    }

    @Test
    public void checkGetMaxThrowsErrorWhenListEmpty(){
        NoSuchElementException ex = assertThrows(NoSuchElementException.class, () -> {
           history.getMax();
        });
        System.out.println("Thrown exception as expected: " + ex.getMessage());

    }

    @Test
    public void checkGetMinThrowsErrorWhenListEmpty(){
        NoSuchElementException ex = assertThrows(NoSuchElementException.class, () -> {
            history.getMin();
        });
        System.out.println("Thrown exception as expected: " + ex.getMessage());

    }

    @Test
    public void checkGetAverageThrowsErrorWhenListEmpty(){
        NoSuchElementException ex = assertThrows(NoSuchElementException.class, () -> {
            history.getAverage();
        });
        System.out.println("Thrown exception as expected: " + ex.getMessage());
        assertEquals("The average could not be calculated, because there are no elements saved in this TemperatureHistory object", ex.getMessage());
    }
}