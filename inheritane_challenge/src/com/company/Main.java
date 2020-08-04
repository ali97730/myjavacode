package com.company;

public class Main {

    public static void main(String[] args) {
     Vehicle vehicle = new Vehicle(8,5,4,3,2);
     vehicle.steering(3);
     vehicle.move(6);

     Car car = new Car(4,4,4,42,2,4);
     car.steering(3);
     car.move(2);


    }
}
