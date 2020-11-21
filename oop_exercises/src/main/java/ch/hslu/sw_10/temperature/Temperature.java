package ch.hslu.sw_10.temperature;

import ch.hslu.sw_10.temperature.TemperatureEnums;

import java.util.Objects;

/**
 * A simple class that holds information about the current temperature value.
 * Provides methods to access this value in different units.
 * @author Nicolas Vondru (nicolas.vondru@stud.hslu.ch)
 * @version 3.0
 */

public final class Temperature implements Comparable<Temperature>{
    public static final float KELVIN_OFFSET = 273.15f;
    private final float kelvin;

    /**
     * @param kelvin The initial temperature value in kelvin.
     */
    private Temperature(final float kelvin){
        if (kelvin >= 0.00f){
            this.kelvin = kelvin;
        }else{
            throw new IllegalArgumentException("The passed argument remapped to " + kelvin + " kelvin is physically incorrect!");
        }
    }

    /**
     * @param value The initial temperature value in kelvin.
     * @param type The scale type which should be used while storing the temperature value. (KELVIN, CELSIUS, FAHRENHEIT)
     */
    public Temperature(final float value, final TemperatureEnums type) {
        float tempKelvin = 0f;

        if (type.equals(TemperatureEnums.KELVIN)){
            tempKelvin = value;
        }else if (type.equals(TemperatureEnums.CELSIUS)){
            tempKelvin = convertCelsiusToKelvin(value);
        }else if(type.equals(TemperatureEnums.FAHRENHEIT)){
            tempKelvin = convertFahrenheitToKelvin(value);
        }

        if (tempKelvin >= 0.00f){
            this.kelvin = tempKelvin;
        }else{
            throw new IllegalArgumentException("The passed argument " + value + " " + type + " is physically incorrect!");
        }
    }

    public static Temperature createFromKelvin(final float kelvin){
        return new Temperature(kelvin);
    }

    public static Temperature createFromCelsius(final float celsius){
        return new Temperature(convertCelsiusToKelvin(celsius));
    }

    public static Temperature createFromFahrenheit(final float fahrenheit){
        return new Temperature(convertFahrenheitToKelvin(fahrenheit));
    }

    /**
     * @return Current temperature value in celsius.
     */
    public final float getCelsius() {
        return Temperature.convertKelvinToCelsius(this.kelvin);
    }

    /**
     * @return Current temperature value in kelvin.
     */
    public final float getKelvin(){
        return kelvin;
    }

    /**
     * @return Current temperature value in fahrenheit.
     */
    public final float getFahrenheit(){
        return Temperature.convertKelvinToFahrenheit(this.kelvin);
    }

    public static float convertKelvinToCelsius(float kelvin){
        return kelvin - KELVIN_OFFSET;
    }

    public static float convertCelsiusToKelvin(float celsius){
        return celsius + KELVIN_OFFSET;
    }

    public static float convertKelvinToFahrenheit(float kelvin){
        return Temperature.convertKelvinToCelsius(kelvin) * 1.80f + 32.00f;
    }

    public static float convertFahrenheitToKelvin(float fahrenheit){
        return ((fahrenheit - 32f) / 1.8f) + KELVIN_OFFSET;
    }

    @Override
    public final boolean equals(Object object){
        if (object == this){
            return true;
        }
        if (!(object instanceof Temperature)){
            return false;
        }
        Temperature other = (Temperature) object;
//        use Float.compare() when comparing floats!
        return Float.compare(other.kelvin, this.kelvin) == 0;
    }

    @Override
    public final int hashCode(){
        return Objects.hash(this.kelvin);
    }


    @Override
    public int compareTo(Temperature other) {
        return Float.compare(this.kelvin, other.kelvin);
    }

    @Override
    public String toString(){
        return this.getClass().getName() + "[kelvin=" + this.kelvin + ";celsius=" + this.getCelsius() + ";fahrenheit=" + this.getFahrenheit() + "]";
    }
}
