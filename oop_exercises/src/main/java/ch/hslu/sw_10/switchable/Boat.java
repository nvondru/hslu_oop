package ch.hslu.sw_10.switchable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Boat implements Switchable, PropertyChangeListener {

    private Motor motor;
    private String lastNotification;

    public Boat() {
        this.motor = new Motor(SwitchState.OFF);
        this.motor.addPropertyChangeListener(this);
    }

    public Motor getMotor() {
        return motor;
    }

    public String getLastNotification() {
        return lastNotification;
    }

    @Override
    public void switchOn() {
        this.motor.switchOn();
    }

    @Override
    public void switchOff() {
        this.motor.switchOff();
    }

    @Override
    public boolean isSwitchedOn() {
        return this.motor.isSwitchedOn() ? true : false;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.motor.isSwitchedOff() ? true : false;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.lastNotification = evt.toString();
    }
}
