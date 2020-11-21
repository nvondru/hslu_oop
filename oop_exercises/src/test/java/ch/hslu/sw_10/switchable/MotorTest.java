package ch.hslu.sw_10.switchable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {
    private Motor motor;

    // do i have to do these tests ? switchOn & switchOff are used in checkSwitchOn and Off
    @Test
    void checkIsSwitchedOnWhenOn() {
        motor = new Motor(SwitchState.ON);
        assertEquals(true, motor.isSwitchedOn());
    }

    @Test
    void checkIsSwitchedOnWhenOff() {
        motor = new Motor(SwitchState.OFF);
        assertEquals(false, motor.isSwitchedOn());
    }

    @Test
    void checkIsSwitchedOffWhenOn() {
        motor = new Motor(SwitchState.ON);
        assertEquals(false, motor.isSwitchedOff());
    }

    @Test
    void checkIsSwitchedOffWhenOff() {
        motor = new Motor(SwitchState.OFF);
        assertEquals(true, motor.isSwitchedOff());
    }

    @Test
    void checkSwitchOn() {
        motor = new Motor(SwitchState.OFF);
        motor.switchOn();
        assertEquals(true, motor.isSwitchedOn());
        assertEquals(false, motor.isSwitchedOff());
    }

    @Test
    void checkSwitchOff() {
        motor = new Motor(SwitchState.ON);
        motor.switchOff();
        assertEquals(true, motor.isSwitchedOff());
        assertEquals(false, motor.isSwitchedOn());
    }


}