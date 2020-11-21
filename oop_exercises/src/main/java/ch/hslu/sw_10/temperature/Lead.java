package ch.hslu.sw_10.temperature;

import ch.hslu.sw_08.chemicalElement.ChemicalElement;
import ch.hslu.sw_08.chemicalElement.Temperature;

public class Lead extends ChemicalElement {

    public Lead(ch.hslu.sw_08.chemicalElement.Temperature temperature){
        super("PB", temperature, new ch.hslu.sw_08.chemicalElement.Temperature(600.61f), new Temperature(2017.00f));
    }
}
