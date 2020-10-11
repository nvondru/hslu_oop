package ch.hslu.temperature;

public class ChemicalElement {

    private final String nameIdent;
    private final Temperature temperature;
    private final float boilingPoint_kelvin;
    private final float bubblingPoint_kelvin;
    
    public ChemicalElement(String nameIdent, Temperature temperature, float boilingPoint_kelvin, float bubblingPoint_kelvin) {
        this.nameIdent = nameIdent;
        this.temperature = temperature;
        this.boilingPoint_kelvin = boilingPoint_kelvin;
        this.bubblingPoint_kelvin = bubblingPoint_kelvin;
    }

    public String getNameIdent() {
        return nameIdent;
    }

    public Temperature getTemperature() {
        return temperature;
    }

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
