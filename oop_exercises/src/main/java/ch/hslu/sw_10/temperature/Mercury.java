package ch.hslu.sw_10.temperature;

import ch.hslu.sw_08.chemicalElement.ChemicalElement;
import ch.hslu.sw_08.chemicalElement.Temperature;

public class Mercury extends ChemicalElement {
    public Mercury(ch.hslu.sw_08.chemicalElement.Temperature temperature){

        super("Hg", temperature, new ch.hslu.sw_08.chemicalElement.Temperature(243.32f), new Temperature(630.20f));
    }

    @Override
    public String toString(){
        return super.toString() + "(GIFTIG)";
    }
}
