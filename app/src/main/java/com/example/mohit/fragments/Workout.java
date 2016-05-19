package com.example.mohit.fragments;

/**
 * Created by mohit on 17/5/16.
 */
public class Workout {
    private String name;
    private String details;

    Workout(String name, String details) {
        this.name = name;
        this.details = details;
    }

    static Workout[] work_list =  {
            new Workout("pushups","100 52 anjanc"),
            new Workout("khupach","njacn ajjsnja jans na"),
            new Workout("Rajul","QWERTyuiop ajcnc ndak")
    };

    public String getName() {
        return this.name;
    }

    public String getDetails(){
        return this.details;
    }
}
