package ch.hslu.vehicle;

public class Motor implements Switchable {

    private boolean running = false;

    public Motor(boolean running) {
        this.running = running;
    }

    @Override
    public void switchOn() {
        this.running = true;
    }
    @Override
    public void switchOff() {
        this.running = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.running ? true : false;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.running ? false : true;
    }
}
