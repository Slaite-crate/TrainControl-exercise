package com.company;

public abstract class State {
    private boolean isOn;
    private String name;

    public State(String name){
        isOn = false;
        this.name = name;
    }

    public abstract String getState();

    public boolean getIsOn(){
        return isOn;
    }
}
