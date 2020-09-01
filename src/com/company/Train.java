package com.company;

public class Train extends State {

    public Train(){
        isOn = false;
    }

    @Override
    public String getState() {
        if (isOn){
            return "east";
        }  else {
            return "west";
        }
    }
}
