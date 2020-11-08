package ch.hslu.sw_08.chemicalElement;

import java.util.Objects;

/**
 * A simple class that holds information about the current temperature value.
 * Provides methods to access this value in different units.
 * @author Nicolas Vondru (nicolas.vondru@stud.hslu.ch)
 * @version 3.0
 */

public final class Temperature implements Comparable<Temperature>{
    public static final float KELVIN_OFFSET = 273.15f;
    private float kelvin;

    /**
     * @param kelvin The initial temperature value in kelvin.
     */
    public Temperature(final float kelvin) {
        this.setKelvin(kelvin);
    }

    /**
     * @param kelvin Temperature value in kelvin which will be set as the new temperature value.
     */
    public void setKelvin(final float kelvin) {
        if (kelvin >= 0.00f && kelvin <= 3000.00f){
            this.kelvin = kelvin;
        }else{
            System.out.println("Temperature not in range! Nothing changed.");
        }
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

    /**
     * @param kelvin Temperature value which should be added to the current value. Enter negative value in order to subtract.
     */
    public void addKelvin(float kelvin){
        this.setKelvin(this.getKelvin() + kelvin);
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
