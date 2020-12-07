package ch.hslu.sw_10.switchable;

import ch.hslu.sw_05.named.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Vehicle implements CountingSwitchable, Named, PropertyChangeListener {
    private Light[] lights = new Light[2];
    private Motor motor;
    private int switchCounter;
    private static int SWITCH_COUNTER = 0;
    private String name;
    private static final Logger LOG = LogManager.getLogger(Vehicle.class);
    private PropertyChangeEvent lastEvent;

    public Vehicle() {
        this.lights[0] = new Light(SwitchState.OFF);
        this.lights[1] = new Light(SwitchState.OFF);
        this.motor = new Motor(SwitchState.OFF);
        this.switchCounter = 0;

        this.motor.addPropertyChangeListener(this);
    }

    public static int GET_SWITCH_COUNTER(){
        return SWITCH_COUNTER;
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

    public Light[] getLights(){
        return  this.lights;
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
    public void switchOn() {
        if (this.isSwitchedOff()){
            this.motor.switchOn();
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
    public int getSwitchCount() {
        return this.switchCounter;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getSource() == this.motor){
            this.handle_MotorEvent(evt);
        }
    }

    private void handle_MotorEvent(PropertyChangeEvent event){
        LOG.info(event.toString());
        this.lastEvent = event;
    }

    public PropertyChangeEvent getLastEvent() {
        return this.lastEvent;
    }

    public Motor getMotor() {
        return motor;
    }
}
