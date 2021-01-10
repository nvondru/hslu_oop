package ch.hslu.sw_07;

import java.util.Objects;

/**
 * A simple class that holds information about the current temperature value.
 * Provides methods to access this value in different units.
 * @author Nicolas Vondru (nicolas.vondru@stud.hslu.ch)
 * @version 2.0
 */

public class Temperature implements Comparable<Temperature>{
    private float kelvin;

    /**
     * @param kelvin The initial temperature value in kelvin.
     */
    public Temperature(float kelvin) {
        this.setKelvin(kelvin);
    }

    /**
     * @param kelvin Temperature value in kelvin which will be set as the new temperature value.
     */
    public void setKelvin(float kelvin) {
        if (kelvin >= 0.00f && kelvin <= 3000.00f){
            this.kelvin = kelvin;
        }else{
            System.out.println("Temperature not in range! Nothing changed.");
        }
    }

    /**
     * @return Current temperature value in celsius.
     */
    public float getCelsius() {
        return kelvin - 273.15f;
    }

    /**
     * @return Current temperature value in kelvin.
     */
    public float getKelvin(){
        return kelvin;
    }

    /**
     * @return Current temperature value in fahrenheit.
     */
    public float getFahrenheit(){
        return this.getCelsius() * 1.80f + 32.00f;
    }

    /**
     * @param kelvin Temperature value which should be added to the current value. Enter negative value in order to subtract.
     */
    public void addKelvin(float kelvin){
        this.setKelvin(this.getKelvin() + kelvin);
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
        return "Temperature[kelvin=" + this.kelvin + "]";
    }
}
