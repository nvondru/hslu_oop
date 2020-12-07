package ch.hslu.sw_10.temperature;

/**
 * Listener Interface that is used to register for notifications of changes in temperature values.
 * @see TemperatureMinMaxEvent
 */
public interface TemperatureMinMaxListener {
    public abstract void temperatureMinMaxChange(TemperatureMinMaxEvent event);
}
