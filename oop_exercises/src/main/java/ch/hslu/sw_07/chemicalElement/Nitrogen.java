package ch.hslu.sw_07.chemicalElement;

public class Nitrogen extends ChemicalElement {

    public Nitrogen(Temperature temperature){
        super("N", temperature, new Temperature(63.05f), new Temperature(77.15f));
    }
}
