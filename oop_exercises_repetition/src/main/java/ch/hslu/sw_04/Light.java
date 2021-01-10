package ch.hslu.sw_04;

public class Light implements Switchable {

    private boolean switchedOn = false;

    public Light(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    @Override
    public void switchOn() {
        this.switchedOn = true;
    }

    @Override
    public void switchOff() {
        this.switchedOn = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.switchedOn ? true : false;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.switchedOn ? false : true;
    }
}
