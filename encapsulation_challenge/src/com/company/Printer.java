package com.company;

public class Printer {
    private int toner_level =10;
    private int numberofPagesPrinted = 0;
    private boolean duplex = false;



    public void printedPages(int toner_level,int numberofPagesPrinted,boolean duplex){
        if(toner_level == 100)
        {
            System.out.println("the maximum capacity has reached");
        }else {
            if (duplex == true) {
                this.numberofPagesPrinted = 2 * numberofPagesPrinted;
                this.toner_level = this.numberofPagesPrinted*toner_level;
            } else {
                this.numberofPagesPrinted = numberofPagesPrinted;
                this.toner_level = this.numberofPagesPrinted*toner_level;
            }
              }

    }

    public int getToner_level() {
        return toner_level;
    }

    public int getNumberofPagesPrinted() {

        return numberofPagesPrinted;
    }
}
