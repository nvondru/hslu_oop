package ch.hslu.sw_10.switchable;

/**
 * Classes implementing this interface should be able deliver information about the amount of times they were switched on or off.
 * Specialization of the "Switchable" interface.
 * @author Nicolas Vondru
 * @version 1.0
 * @since 18.10.2020
 * @see Switchable
 */
public interface CountingSwitchable extends Switchable {
    /**
     * Returns the amount of times the element was switched on or off.
     * @return Value representing the amount of switch events.
     */
    int getSwitchCount();
}
