package com.company;

public class Track extends State {

    public Track(){
        isOn = false;
    }

    @Override
    public String getState() {
        if (isOn){
            return "with train";
        } else {
            return "empty";
        }
    }
}
