package com.company;

public class Main {

    public static void main(String[] args) {
    Printer p = new Printer();
    p.printedPages(10,10,false);
        System.out.println("the number of pages printed is " + p.getNumberofPagesPrinted()
                + "AND THE TONER LEVEL IS" + p.getToner_level());
    }
}
