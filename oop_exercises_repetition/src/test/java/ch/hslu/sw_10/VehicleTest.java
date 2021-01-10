package ch.hslu.sw_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testSwitchOnNotification(){
        Vehicle vehicle = new Vehicle();
        vehicle.switchOn();
    }
}