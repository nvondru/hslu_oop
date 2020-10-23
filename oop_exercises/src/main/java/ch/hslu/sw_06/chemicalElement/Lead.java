package ch.hslu.sw_06.chemicalElement;

public class Lead extends ChemicalElement {

    public Lead(Temperature temperature){
        super("PB", temperature, new Temperature(600.61f), new Temperature(2017.00f));
    }
}
