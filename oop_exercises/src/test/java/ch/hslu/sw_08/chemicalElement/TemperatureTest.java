package ch.hslu.sw_08.chemicalElement;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
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

    @Test
    public void checkEqualsVerifier(){
        EqualsVerifier.forClass(Temperature.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void checkTemperatureEquality(){
        Temperature other = new Temperature(temperature.getKelvin());
        assertEquals(other, temperature);
    }

    @Test
    public void checkTemperatureHashCodes(){
        Temperature other = new Temperature(temperature.getKelvin());
        assertEquals(other.hashCode(), temperature.hashCode());
    }

    @Test
    public void checkOtherSmallerThanTemperature(){
        Temperature other = new Temperature(temperature.getKelvin() - 10f);
        assertEquals(-1, other.compareTo(temperature));
    }

    @Test
    public void checkOtherEqualsRankOfTemperature(){
        Temperature other = new Temperature(temperature.getKelvin());
        assertEquals(0, other.compareTo(temperature));
    }

    @Test
    public void checkOtherGreaterThanTemperature(){
        Temperature other = new Temperature(temperature.getKelvin() + 10f);
        assertEquals(1, other.compareTo(temperature));
    }

    @Test
    public void checkStaticKelvinToCelsiusConversion(){
        assertEquals(0f, Temperature.convertKelvinToCelsius(Temperature.KELVIN_OFFSET), 0.0001f);
    }

    @Test
    public void checkStaticCelsiusToKelvinConversion(){
        assertEquals(273.15f, Temperature.convertCelsiusToKelvin(0f), 0.0001f);
    }

    @Test
    public void checkStaticKelvinToFahrenheitConversion(){
        assertEquals(32f, Temperature.convertKelvinToFahrenheit(Temperature.KELVIN_OFFSET), 0.0001f);
    }
}