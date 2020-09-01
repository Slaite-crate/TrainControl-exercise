package com.company;

public class Signal extends State {

    public Signal(){
        isOn = false;
    }

    @Override
    public String getState() {
        if (isOn){
            return "green";
        } else {
            return "red";
        }
    }
}
