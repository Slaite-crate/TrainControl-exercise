package com.company.models;

public class Train extends State {


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
