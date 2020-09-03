package com.company.models;

/**
 * The type Train.
 */
public class Train extends State {


    /**
     * Instantiates a new Train.
     *
     * @param name the name
     */
    public Train(String name) {
        super(name);
    }

    @Override
    public String getState() {
        if (getIsOn()){
            return "east";
        }  else {
            return "west";
        }
    }
}
