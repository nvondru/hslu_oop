package ch.hslu.sw_10.switchable;

public class Light implements Switchable {

    private SwitchState switchState;

    public Light(SwitchState switchState) {
        this.switchState = switchState;
    }

    @Override
    public void switchOn() {
        this.switchState = SwitchState.ON;
    }

    @Override
    public void switchOff() {
        this.switchState = SwitchState.OFF;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.switchState.equals(SwitchState.ON) ? true : false;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.switchState.equals(SwitchState.ON) ? false : true;
    }
}
