package ch.hslu.sw_07.chemicalElement;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    private Temperature temperature;

    @BeforeEach
    public void setup(){
        temperature = new Temperature(273.15f);
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
}