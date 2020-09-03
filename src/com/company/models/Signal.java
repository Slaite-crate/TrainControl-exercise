package com.company.models;


/**
 * The type Signal.
 */
public class Signal extends State {

    /**
     * Instantiates a new Signal.
     *
     * @param name the name
     */
    public Signal(String name) {
        super(name);
    }

    @Override
    public String getState() {
        if (getIsOn()){
            return "green";
        } else {
            return "red";
        }
    }
}
