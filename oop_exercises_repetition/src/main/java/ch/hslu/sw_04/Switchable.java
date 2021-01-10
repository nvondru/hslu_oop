package ch.hslu.sw_04;

/**
 * Defines the role of an object which has a state that can be switched on and off.
 * @author Nicolas Vondru
 * @version 1.0
 */
public interface Switchable {
    /**
     * Sets state to "on"
     */
    void switchOn();

    /**
     * Sets state to "off"
     */
    void switchOff();

    /**
     * @return Returns "true" if state is switched on
     */
    boolean isSwitchedOn();

    /**
     * @return Returns "true" if state is switched off
     */
    boolean isSwitchedOff();
}
