package ch.hslu.temperature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    private Temperature temperature;

    @BeforeEach
    public void setupTemperature(){
        this.temperature = new Temperature(273.15f);
    }


    @Test
    public void checkUnitCalculations(){
        assertEquals(0.00f, temperature.getCelsius(), 0.01f);
        assertEquals(32.00f, temperature.getFahrenheit(), 0.01f);
    }

    @Test
    public void checkTemperaturAddition(){
        temperature.addKelvin(50.00f);
        assertEquals(323.15f, temperature.getKelvin(), 0.01f);
        assertEquals(50.00f, temperature.getCelsius(), 0.01f);
        assertEquals(122.00f, temperature.getFahrenheit(), 0.01f);
    }

}