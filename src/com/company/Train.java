package com.company;

public class Train extends State {


    public Train(String name) {
        super(name);
    }

    @Override
    public String getState() {
        if (getIsOn()){
            return "right";
        }  else {
            return "left";
        }
    }
}
