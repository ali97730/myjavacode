package com.company;

public class Vehicle {
    private int tyre;
    private int speed;
    private int fuel;
    private int gear;
    private int medium;


    public Vehicle(int tyre, int speed, int fuel, int gear, int medium) {
        this.tyre = tyre;
        this.speed = speed;
        this.fuel = fuel;
        this.gear = gear;
        this.medium = medium;
        System.out.println("parameterised costructor was called");
    }

    public void steering( int tyre)
    {
        System.out.println("vehicle.steering is called");
        this.tyre = tyre;
    }
    public void move(int speed)
    {
        System.out.println("vehicle.speed was called");
        this.speed = speed;
    }

    public int getTyre() {
        return tyre;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public int getGear() {
        return gear;
    }

    public int getMedium() {
        return medium;
    }
}
