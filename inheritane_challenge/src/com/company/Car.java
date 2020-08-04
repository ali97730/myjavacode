package com.company;

public class Car extends Vehicle {
    private int color;
    private int model;
    private int milege;

    public Car( int speed, int fuel, int gear, int color, int model, int milege) {
        super(4, speed, fuel, gear,5);
        this.color = color;
        this.model = model;
        this.milege = milege;
    }


    public void steering(int tyre) {
        System.out.println("car.steering is called");//steering(tyre);
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }
}
