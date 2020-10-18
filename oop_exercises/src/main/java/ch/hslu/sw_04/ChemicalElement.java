package ch.hslu.sw_04;

import ch.hslu.sw_05.named.Named;

/**
 * A simple class that holds information about a chemical element and its temperature.
 * Provides methods to check the current aggregation state of the element.
 * @author Nicolas Vondru (nicolas.vondru@stud.hslu.ch)
 * @version 1.0
 */
public class ChemicalElement {

    private final String nameIdent;
    private final Temperature temperature;
    private final float boilingPoint_kelvin;
    private final float bubblingPoint_kelvin;

    /**
     *
     * @param nameIdent Name of the element (eg. Blei)
     * @param temperature Temperature object for this element. (eg. temperature.kelvin = 273.15K)
     * @param boilingPoint_kelvin Defines the temperature (in kelvin) needed, so that the element changes between solid and fluid state.
     * @param bubblingPoint_kelvin Defines the temperature (in kelvin) needed, so that the element changes between fluid and gaseous state.
     */
    public ChemicalElement(String nameIdent, Temperature temperature, float boilingPoint_kelvin, float bubblingPoint_kelvin) {
        this.nameIdent = nameIdent;
        this.temperature = temperature;
        this.boilingPoint_kelvin = boilingPoint_kelvin;
        this.bubblingPoint_kelvin = bubblingPoint_kelvin;
    }

    /**
     *
     * @return Name of the element (eg. Blei)
     */
    public String getNameIdent() {
        return nameIdent;
    }

    /**
     *
     * @return Temperature object of the element.
     * @see Temperature
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Calculates the current aggregation state of the element according to its temperature and bubblingPoint / boilingPoint and returns it.
     * @see Temperature
     * @return Current aggregation state (solid, liquid or gaseous)
     */
    public String getAggregationState(){
        if (this.temperature.getKelvin() < this.boilingPoint_kelvin){
            return "solid";
        }else if(this.temperature.getKelvin() < this.bubblingPoint_kelvin){
            return "liquid";
        }else{
            return "gaseous";
        }
    }

}
