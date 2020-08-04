package com.company;

public class Main {
    static  int multiply(int x,int y) {
        if (y == 0) {
            return 0;
        } else {
            return  x +multiply(x,y-1);

        }
    }
    public static void main(String[] args) {
        int numberofpassengers = 120000;
        int numberofdays = 365;
        int result = multiply(numberofpassengers,numberofdays);
        System.out.println(result);
	 }
}
