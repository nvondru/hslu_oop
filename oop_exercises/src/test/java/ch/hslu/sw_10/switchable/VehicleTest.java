package ch.hslu.sw_10.switchable;

import ch.hslu.sw_10.switchable.Motor;
import ch.hslu.sw_10.switchable.SwitchState;
import ch.hslu.sw_10.switchable.Vehicle;
import ch.hslu.sw_10.switchable.Light;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.beans.PropertyChangeEvent;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Vehicle vehicle;
    @BeforeEach
    public void setup(){
        vehicle = new Vehicle();
    }

    @Test
    public void checkStateAfterInstatiation(){
        assertEquals(false, vehicle.isSwitchedOn());
        assertEquals(true, vehicle.isSwitchedOff());
    }

    @Test
    public void checkSwitchOn(){
        vehicle.switchOn();
        assertEquals(true, vehicle.isSwitchedOn());
        assertEquals(false, vehicle.isSwitchedOff());
    }

    @Test
    public void checkSwitchOff(){
        vehicle.switchOn();
        vehicle.switchOff();
        assertEquals(false, vehicle.isSwitchedOn());
        assertEquals(true, vehicle.isSwitchedOff());
    }

    @Test
    public void checkSwitchCounterAfterSuccessfullSwitch(){
        vehicle.switchOn();
        vehicle.switchOff();
        assertEquals(2, vehicle.getSwitchCount());
    }

    @Test
    public void checkSwitchCounterAfterUnsuccessfullSwitch(){
        vehicle.switchOn();
        vehicle.switchOn();
        assertEquals(1, vehicle.getSwitchCount());
    }
    @Test
    public void checkSwitchOnLights(){
        vehicle.switchOnLights();
        for (Light light : vehicle.getLights()){
            assertEquals(true, light.isSwitchedOn());
            assertEquals(false, light.isSwitchedOff());
        }
    }

//    also depends on switchOnLights.... how to fix?
    @Test
    public void checkSwitchOffLights(){
        vehicle.switchOnLights();
        vehicle.switchOffLights();
        for (Light light : vehicle.getLights()){
            assertEquals(false, light.isSwitchedOn());
            assertEquals(true, light.isSwitchedOff());
        }
    }

    @Test
    public void checkManuallyFiredSwitchNotification(){
        PropertyChangeEvent event = new PropertyChangeEvent(vehicle.getMotor(), "switchState", SwitchState.OFF, SwitchState.ON);
        vehicle.getMotor().firePropertyChangeEvent(event);
        // i added Vehicle.getLastNotification() just for testing -> we should not implement/modify logic just for testing?!?
        assertEquals(event.toString(), vehicle.getLastNotification());
    }

    @Test
    public void checkAutomaticallyFiredSwitchNotification(){
        vehicle.switchOn();
//        ?!
        // can this even be tested? i have no access to original event object
//        what should be asserted?

    }

    // How do I test static methods that access static fields???

    @Test
    public void checkStaticSwitchCounterAfterSuccessfullSwitches(){
        Vehicle otherVehicle = new Vehicle();

        vehicle.switchOn();
        otherVehicle.switchOn();

        assertEquals(2, Vehicle.GET_SWITCH_COUNTER());
    }

    @Test
    public void checkStaticSwitchCounterAfterUnsuccessfullSwitches(){
        Vehicle otherVehicle = new Vehicle();

        vehicle.switchOn();
        vehicle.switchOn();
        otherVehicle.switchOn();
        otherVehicle.switchOn();

        assertEquals(2, Vehicle.GET_SWITCH_COUNTER());
    }




}