package ch.hslu.sw_10.switchable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightTest {
    private Light light;

    // do i have to do these tests ? switchOn & switchOff are used in checkSwitchOn and Off
    @Test
    void checkIsSwitchedOnWhenOn() {
        light = new Light(SwitchState.ON);
        assertEquals(true, light.isSwitchedOn());
    }

    @Test
    void checkIsSwitchedOnWhenOff() {
        light = new Light(SwitchState.OFF);
        assertEquals(false, light.isSwitchedOn());
    }

    @Test
    void checkIsSwitchedOffWhenOn() {
        light = new Light(SwitchState.ON);
        assertEquals(false, light.isSwitchedOff());
    }

    @Test
    void checkIsSwitchedOffWhenOff() {
        light = new Light(SwitchState.OFF);
        assertEquals(true, light.isSwitchedOff());
    }

    @Test
    void checkSwitchOn() {
        light = new Light(SwitchState.OFF);
        light.switchOn();
        assertEquals(true, light.isSwitchedOn());
        assertEquals(false, light.isSwitchedOff());
    }

    @Test
    void checkSwitchOff() {
        light = new Light(SwitchState.ON);
        light.switchOff();
        assertEquals(true, light.isSwitchedOff());
        assertEquals(false, light.isSwitchedOn());
    }

}