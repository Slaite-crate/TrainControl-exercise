package com.company;

public class Switch extends State {

    public Switch(){
        isOn = false;
    }

    @Override
    public String getState() {
        if (isOn){
            return "Straight";
        } else {
            return "curved";
        }
    }
}
