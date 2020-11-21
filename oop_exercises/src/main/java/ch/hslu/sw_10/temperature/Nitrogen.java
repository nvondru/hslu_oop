package ch.hslu.sw_10.temperature;

import ch.hslu.sw_08.chemicalElement.ChemicalElement;
import ch.hslu.sw_08.chemicalElement.Temperature;

public class Nitrogen extends ChemicalElement {

    public Nitrogen(ch.hslu.sw_08.chemicalElement.Temperature temperature){
        super("N", temperature, new ch.hslu.sw_08.chemicalElement.Temperature(63.05f), new Temperature(77.15f));
    }
}
