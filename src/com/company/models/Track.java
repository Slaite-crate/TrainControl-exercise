package com.company.models;


/**
 * The type Track.
 */
public class Track extends State {


    /**
     * Instantiates a new Track.
     *
     * @param name the name
     */
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
