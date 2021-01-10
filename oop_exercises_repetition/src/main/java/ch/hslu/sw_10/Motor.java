package ch.hslu.sw_10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {

    private boolean running = false;
    private final List<PropertyChangeListener> listeners = new ArrayList<>();

    public Motor(boolean running) {
        this.running = running;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        if (listener != null){
            listeners.add(listener);
        }
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        if (listener != null){
            listeners.remove(listener);
        }
    }
    
    public void firePropertyChangeEvent(PropertyChangeEvent event){
        for(PropertyChangeListener listener : listeners){
            listener.propertyChange(event);
        }
    }

    @Override
    public void switchOn() {
        if (!this.running){
            PropertyChangeEvent event = new PropertyChangeEvent(this, "running", this.running, true);
            this.running = true;
            firePropertyChangeEvent(event);
        }
    }
    @Override
    public void switchOff() {
        if (this.running){
            PropertyChangeEvent event = new PropertyChangeEvent(this, "running", this.running, false);
            this.running = false;
            firePropertyChangeEvent(event);
        }
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
