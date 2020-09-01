package com.company;

public class Switch extends State {

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
