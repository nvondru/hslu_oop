package ch.hslu.sw_05.switchable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void checkStaticSwitchCounter(){
        Vehicle audi = new Vehicle();
        Vehicle bmw = new Vehicle();

        System.out.println("Switchcounter for Audi: " + audi.getSwitchCount());
        System.out.println("Switchcounter for BMW: " + bmw.getSwitchCount());
        System.out.println("Switchcounter for all vehicles: " + Vehicle.GET_SWITCH_COUNTER());

        audi.switchOn();

        System.out.println("Switchcounter for Audi: " + audi.getSwitchCount());
        System.out.println("Switchcounter for BMW: " + bmw.getSwitchCount());
        System.out.println("Switchcounter for all vehicles: " + Vehicle.GET_SWITCH_COUNTER());


        bmw.switchOn();

        System.out.println("Switchcounter for Audi: " + audi.getSwitchCount());
        System.out.println("Switchcounter for BMW: " + bmw.getSwitchCount());
        System.out.println("Switchcounter for all vehicles: " + Vehicle.GET_SWITCH_COUNTER());


        audi.switchOff();
        audi.switchOn();
        audi.switchOff();
        audi.switchOn();

        // this should not affect the switch counter, because the vehicle is already switched on
        bmw.switchOn();
        bmw.switchOn();

        System.out.println("Switchcounter for Audi: " + audi.getSwitchCount());
        System.out.println("Switchcounter for BMW: " + bmw.getSwitchCount());
        System.out.println("Switchcounter for all vehicles: " + Vehicle.GET_SWITCH_COUNTER());




    }

}