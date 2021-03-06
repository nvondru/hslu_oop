package ch.hslu.sw_05.chemicalElement;

public class Mercury extends ChemicalElement {
    public Mercury(Temperature temperature){
        super("Hg", temperature, new Temperature(243.32f), new Temperature(630.20f));
    }
}
