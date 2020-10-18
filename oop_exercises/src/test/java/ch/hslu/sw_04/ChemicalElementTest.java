package ch.hslu.sw_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChemicalElementTest {
    private ChemicalElement stickstoff;
    private ChemicalElement quecksilber;
    private ChemicalElement blei;

    @BeforeEach
    public void setUp() throws Exception {

        stickstoff = new ChemicalElement("Stickstoff", new Temperature(), 63.05f, 77.15f);
        quecksilber = new ChemicalElement("Quecksilber", new Temperature(), 243.32f, 630.20f);
        blei = new ChemicalElement("Blei", new Temperature(), 600.61f, 2017.00f);
    }

    @Test
    public void checkSolidState(){
        stickstoff.getTemperature().setKelvin(50.00f);
        quecksilber.getTemperature().setKelvin(200.00f);
        blei.getTemperature().setKelvin(500.00f);

        assertEquals("solid", stickstoff.getAggregationState());
        assertEquals("solid", quecksilber.getAggregationState());
        assertEquals("solid", blei.getAggregationState());
    }

    @Test
    public void checkLiquidState(){
        stickstoff.getTemperature().setKelvin(70.00f);
        quecksilber.getTemperature().setKelvin(300.00f);
        blei.getTemperature().setKelvin(1500.00f);

        assertEquals("liquid", stickstoff.getAggregationState());
        assertEquals("liquid", quecksilber.getAggregationState());
        assertEquals("liquid", blei.getAggregationState());
    }

    @Test
    public void checkGaseousState(){
        stickstoff.getTemperature().setKelvin(3000.00f);
        quecksilber.getTemperature().setKelvin(3000.00f);
        blei.getTemperature().setKelvin(3000.00f);

        assertEquals("gaseous", stickstoff.getAggregationState());
        assertEquals("gaseous", quecksilber.getAggregationState());
        assertEquals("gaseous", blei.getAggregationState());
    }
}