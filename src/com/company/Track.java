package com.company;

public class Track extends State {


    public Track(String name) {
        super(name);
    }

    @Override
    public String getState() {
        if (getIsOn()){
            return "with train";
        } else {
            return "empty";
        }
    }
}
