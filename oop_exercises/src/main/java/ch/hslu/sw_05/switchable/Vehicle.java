package ch.hslu.sw_05.switchable;

import ch.hslu.sw_05.named.Named;

public class Vehicle implements CountingSwitchable, Named {
    private Light[] lights = new Light[2];
    private Motor motor;
    private int switchCounter;
    private static int SWITCH_COUNTER = 0;
    private String name;

    public Vehicle() {
        this.lights[0] = new Light(false);
        this.lights[1] = new Light(false);
        this.motor = new Motor(false);
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public static int GET_SWITCH_COUNTER(){
        return SWITCH_COUNTER;
    }
}
