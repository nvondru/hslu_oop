package ch.hslu.sw_09;

import ch.hslu.SW_09.TemperatureEnums;
import ch.hslu.SW_09.Temperature;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TemperatureTest {
    private Temperature temperature;

    @BeforeEach
    public void setupTemperature(){
        this.temperature = new Temperature(273.15f, TemperatureEnums.KELVIN);
    }


    @Test
    public void checkUnitCalculations(){
        assertEquals(0.00f, temperature.getCelsius(), 0.01f);
        assertEquals(32.00f, temperature.getFahrenheit(), 0.01f);
    }

    @Test
    public void checkEqualsVerifier(){
        EqualsVerifier.forClass(Temperature.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void checkTemperatureEquality(){
        Temperature other = new Temperature(temperature.getKelvin(), TemperatureEnums.KELVIN);
        assertEquals(other, temperature);
    }

    @Test
    public void checkTemperatureHashCodes(){
        Temperature other = new Temperature(temperature.getKelvin(), TemperatureEnums.KELVIN);
        assertEquals(other.hashCode(), temperature.hashCode());
    }

    @Test
    public void checkOtherSmallerThanTemperature(){
        Temperature other = new Temperature(temperature.getKelvin() - 10f, TemperatureEnums.KELVIN);
        assertEquals(-1, other.compareTo(temperature));
    }

    @Test
    public void checkOtherEqualsRankOfTemperature(){
        Temperature other = new Temperature(temperature.getKelvin(), TemperatureEnums.KELVIN);
        assertEquals(0, other.compareTo(temperature));
    }

    @Test
    public void checkOtherGreaterThanTemperature(){
        Temperature other = new Temperature(temperature.getKelvin() + 10f, TemperatureEnums.KELVIN);
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

    @Test
    public void checkIfIllegalArgumentThrowsError(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Temperature(-100, TemperatureEnums.KELVIN);
        });
    }
}