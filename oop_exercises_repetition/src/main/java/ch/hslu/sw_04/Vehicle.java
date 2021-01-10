package ch.hslu.sw_04;

public class Vehicle implements Switchable{
    private Light[] lights = new Light[2];
    private Switchable motor;

    public Vehicle() {
        this.lights[0] = new Light(false);
        this.lights[1] = new Light(false);
        this.motor = new Motor(false);
    }

    @Override
    public void switchOn() {
        this.motor.switchOn();
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
        this.motor.switchOff();
        this.switchOffLights();
    }

    @Override
    public boolean isSwitchedOn() {
        return this.motor.isSwitchedOn();
    }

    @Override
    public boolean isSwitchedOff() {
        return this.motor.isSwitchedOff();
    }
}
