package ch.hslu.sw_05.chemicalElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChemicalElementTest {

    private final float ROOM_TEMPERATURE = 273.15f + 22.0f;

    @Test
    public void checkObjectInstantiation(){
        ChemicalElement oxygen = new ChemicalElement("O", new Temperature(ROOM_TEMPERATURE), new Temperature(54.8f), new Temperature(90.15f));
        ChemicalElement mercury = new Mercury(new Temperature(ROOM_TEMPERATURE));
        ChemicalElement nitrogen = new Nitrogen(new Temperature(ROOM_TEMPERATURE));
        ChemicalElement lead = new Lead(new Temperature(ROOM_TEMPERATURE));

        System.out.println(oxygen.getNameIdent() + " / " + oxygen.getTemperature().getCelsius() + " / " + oxygen.getAggregationState());
        System.out.println(mercury.getNameIdent() + " / " + mercury.getTemperature().getCelsius() + " / " + mercury.getAggregationState());
        System.out.println(nitrogen.getNameIdent() + " / " + nitrogen.getTemperature().getCelsius() + " / " + nitrogen.getAggregationState());
        System.out.println(lead.getNameIdent() + " / " + lead.getTemperature().getCelsius() + " / " + lead.getAggregationState());

        System.out.println(oxygen.getName());
        oxygen.setName("Oxygen");
        System.out.println(oxygen.getName());
    }

}