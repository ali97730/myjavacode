package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The area of circle is : "+ area(-100));
        System.out.println("the area of rectangle is :" + area(100,200));
    }
    public static double area(double radius)
    {
        if(radius < 0){
            System.out.println("Invalid value");
            return -1.0;
        }
        double areaofcircle = radius * radius * Math.PI;
        return areaofcircle;

    }

    public static double area(double x , double y)
    {
        if (x < 0 || y < 0){
            System.out.println("Invalid value");
            return -1.0;
        }
        double areaofrectangle = x * y;
        return areaofrectangle;
    }
}
