package com.company.models;


public class Signal extends State {

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
