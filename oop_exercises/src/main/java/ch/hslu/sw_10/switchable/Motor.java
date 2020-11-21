package ch.hslu.sw_10.switchable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {

    private SwitchState switchState = SwitchState.OFF;
    private List<PropertyChangeListener> changeListeners = new ArrayList<>();

    public Motor(SwitchState switchState) {
        this.switchState = switchState;
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener){
        if (listener != null){
            this.changeListeners.add(listener);
        }
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener){
        if (listener != null){
            this.changeListeners.remove(listener);
        }
    }

    public void firePropertyChangeEvent(PropertyChangeEvent event){
        for (PropertyChangeListener listener : this.changeListeners){
            listener.propertyChange(event);
        }
    }

    @Override
    public void switchOn() {
        if (!this.isSwitchedOn()){
            PropertyChangeEvent event = new PropertyChangeEvent(this, "switchState", this.switchState, SwitchState.ON);
            this.switchState = SwitchState.ON;
            this.firePropertyChangeEvent(event);
        }
    }
    @Override
    public void switchOff() {
        if (!this.isSwitchedOff()){
            this.switchState = SwitchState.OFF;
        }
    }

    public void idle(){
        if (!this.isIdling()){
            PropertyChangeEvent event = new PropertyChangeEvent(this, "switchState", this.switchState, SwitchState.IDLE);
            this.switchState = SwitchState.IDLE;
            this.firePropertyChangeEvent(event);
        }
    }

    private boolean isIdling() {
        return this.switchState.equals(SwitchState.IDLE) ? true : false ;
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
