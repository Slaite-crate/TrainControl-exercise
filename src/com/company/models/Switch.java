package com.company.models;


/**
 * The type Switch.
 */
public class Switch extends State {

    /**
     * Instantiates a new Switch.
     *
     * @param name the name
     */
    public Switch(String name) {
        super(name);
    }

    @Override
    public String getState() {
        if (getIsOn()){
            return "Straight";
        } else {
            return "curved";
        }
    }
}
