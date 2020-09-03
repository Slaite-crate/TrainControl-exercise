package com.company.models;

/**
 * The type State.
 */
public abstract class State {
    private boolean isOn;
    private String name;

    /**
     * Instantiates a new State.
     *
     * @param name the name
     */
    public State(String name){
        isOn = false;
        this.name = name;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public abstract String getState();

    /**
     * Get is on boolean.
     *
     * @return the boolean
     */
    public boolean getIsOn(){
        return isOn;
    }
}
