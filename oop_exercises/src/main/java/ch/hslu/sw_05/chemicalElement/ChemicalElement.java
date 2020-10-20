package ch.hslu.sw_05.chemicalElement;

import ch.hslu.sw_05.named.Named;

/**
 * A simple class that holds information about a chemical element and its temperature.
 * Provides methods to check the current aggregation state of the element.
 * @author Nicolas Vondru (nicolas.vondru@stud.hslu.ch)
 * @version 2.0
 * @since 18.10.2020
 */
public class ChemicalElement implements Named {

    private final String nameIdent;
    private final Temperature temperature;
    private final Temperature boilingPoint;
    private final Temperature bubblingPoint;
    private String name;
    /**
     *
     * @param nameIdent Abbreviation of the elements name (eg. PB for "Lead").
     * @param temperature Temperature object for this element (eg. temperature.kelvin = 273.15K).
     * @param boilingPoint Defines the temperature needed, so that the element changes between solid and fluid state.
     * @param bubblingPoint Defines the temperature needed, so that the element changes between fluid and gaseous state.
     */
    public ChemicalElement(String nameIdent, Temperature temperature, Temperature boilingPoint, Temperature bubblingPoint) {
        this.nameIdent = nameIdent;
        this.temperature = temperature;
        this.boilingPoint = boilingPoint;
        this.bubblingPoint = bubblingPoint;
    }
    /**
     *
     * @return Name of the element (eg. PB)
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
        if (this.temperature.getKelvin() < this.boilingPoint.getKelvin()){
            return "solid";
        }else if(this.temperature.getKelvin() < this.bubblingPoint.getKelvin()){
            return "liquid";
        }else{
            return "gaseous";
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name != null ? this.name : "No name defined yet!";
    }
}
