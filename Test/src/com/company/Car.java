package com.company;


public class Car    {    ///extends Vehicle

    private boolean engine;

    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


    public String startEngine(){
        return "Car >> start engine()";
    }

    public String accelerate() {
        return "Car >> accelerate()";
    }

   public String brake () {
            return "Car >> brake ";


       }
    }

}