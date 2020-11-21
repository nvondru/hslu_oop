package ch.hslu.sw_10.temperature;

import java.util.EventObject;

public class TemperatureMinMaxEvent extends EventObject {

    private final TemperatureEvents eventType;
    private final Temperature oldValue;
    private final Temperature newValue;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public TemperatureMinMaxEvent(final Object source, final TemperatureEvents eventType, final Temperature oldValue, final Temperature newValue) {
        super(source);
        this.eventType = eventType;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Temperature getOldValue() {
        return oldValue;
    }

    public Temperature getNewValue() {
        return newValue;
    }

    public TemperatureEvents getEventType() {
        return eventType;
    }

    @Override
    public String toString(){
        return "TemperatureEvent[source=" + source + ";eventType=" + this.eventType + ";oldValue=" + this.oldValue + ";newValue=" + this.newValue + "]";
    }
}
