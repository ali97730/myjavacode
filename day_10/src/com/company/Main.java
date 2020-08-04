package com.company;

public class Main {

    public static void main(String[] args) {
        // 1 mile = 1.609 km
        float totalmiles = 2052f;
        float totalkilometers;
        totalkilometers = totalmiles * 1.609f;
        System.out.println(totalkilometers);
        int totaldays =6;
        int totalstoponeachday = 2;
        int totalstop = totaldays * totalstoponeachday;
        float averagestop_at = totalkilometers / totalstop;
        System.out.println("the average stop is at " + averagestop_at + "Km");

    }
}
