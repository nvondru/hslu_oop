package ch.hslu.sw_10;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Vehicle implements CountingSwitchable, PropertyChangeListener {
    private Light[] lights = new Light[2];
    private Motor motor;
    private int switchCounter;
    private static int SWITCH_COUNTER = 0;
    private static final Logger LOG = LogManager.getLogger(Vehicle.class);

    public Vehicle() {
        this.lights[0] = new Light(false);
        this.lights[1] = new Light(false);
        this.motor = new Motor(false);
        this.motor.addPropertyChangeListener(this);
        this.switchCounter = 0;
    }


    @Override
    public void switchOn() {
        if (this.isSwitchedOff()){
            this.motor.switchOn();
            this.switchCounter += 1;
            SWITCH_COUNTER += 1;
        }
    }
    public void switchOnLights(){
        for (Light l : this.lights){
            l.switchOn();
        }
    }

    public void switchOffLights(){
        for (Light l : this.lights){
            l.switchOff();
        }
    }

    @Override
    public void switchOff() {
        if (this.isSwitchedOn()){
            this.motor.switchOff();
            this.switchOffLights();
            this.switchCounter += 1;
            SWITCH_COUNTER += 1;
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return this.motor.isSwitchedOn();
    }

    @Override
    public boolean isSwitchedOff() {
        return this.motor.isSwitchedOff();
    }

    @Override
    public long getSwitchCount() {
        return this.switchCounter;
    }

    public static int GET_SWITCH_COUNTER(){
        return SWITCH_COUNTER;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        LOG.info(evt.toString());
    }
}
