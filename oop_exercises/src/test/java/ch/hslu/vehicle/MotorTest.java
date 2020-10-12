package ch.hslu.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {
    private Motor motor;
    @BeforeEach
    public void setup(){
        motor = new Motor(false);
    }

    @Test
    public void checkSwitchingOn(){
        assertEquals(false, motor.isSwitchedOn());
        assertEquals(true, motor.isSwitchedOff());
        motor.switchOn();
        assertEquals(true, motor.isSwitchedOn());
        assertEquals(false, motor.isSwitchedOff());
    }

    @Test
    public void checkSwitchingOff(){
        motor.switchOn();
        assertEquals(true, motor.isSwitchedOn());
        assertEquals(false, motor.isSwitchedOff());
        motor.switchOff();
        assertEquals(false, motor.isSwitchedOn());
        assertEquals(true, motor.isSwitchedOff());
    }

}