package com.company;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,24,23);
        Case thecase = new Case("220B","Dell","245",dimensions);

        Resolution nativeresolution = new Resolution(12,13);
        Monitor monitor = new Monitor("233","111",11,nativeresolution);

        MotherBoard motherBoard = new MotherBoard("12345","asus",4,5,"v2.kk");

        PC thepc = new PC(thecase,monitor,motherBoard);
        // thepc.getMonitor().drawPixelAt(1500,1200,"red");
         //thepc.getMotherBoard().loadProgram("windows");
        // thepc.getThecase().pressPowerButton();
        thepc.powerUp();

    }
}
