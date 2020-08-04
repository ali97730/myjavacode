package com.company;

public class PC {
    private Case thecase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case thecase, Monitor monitor, MotherBoard motherBoard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp()
    {
        thecase.pressPowerButton();
        drawlogo();
    }

    private void drawlogo()
    {
        monitor.drawPixelAt(1200,50,"yellow");

    }

}
