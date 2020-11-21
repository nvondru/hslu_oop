package ch.hslu.sw_10.switchable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.PropertyChangeEvent;

import static org.junit.jupiter.api.Assertions.*;

class BoatTest {
    private Boat boat;

    @BeforeEach
    public void setUp(){
        boat = new Boat();
    }

    @Test
    public void checkStateAfterInstatiation(){
        assertEquals(false, boat.isSwitchedOn());
        assertEquals(true, boat.isSwitchedOff());
    }

    @Test
    public void checkSwitchOn(){
        boat.switchOn();
        assertEquals(true, boat.isSwitchedOn());
        assertEquals(false, boat.isSwitchedOff());
    }

    @Test
    public void checkSwitchOff(){
        boat.switchOn();
        boat.switchOff();
        assertEquals(false, boat.isSwitchedOn());
        assertEquals(true, boat.isSwitchedOff());
    }

    @Test
    public void checkManuallyFiredSwitchNotification(){
        PropertyChangeEvent event = new PropertyChangeEvent(boat.getMotor(), "switchState", SwitchState.OFF, SwitchState.ON);
        boat.getMotor().firePropertyChangeEvent(event);
        // i added Boat.getLastNotification() just for testing -> we should not implement/modify logic just for testing?!?
        assertEquals(event.toString(), boat.getLastNotification());
    }
    
    
    

}