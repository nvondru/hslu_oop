package ch.hslu.sw_05.switchable;

public interface CountingSwitchable extends Switchable{
    int SWITCH_COUNTER = 0;

    long getSwitchCount();
}
