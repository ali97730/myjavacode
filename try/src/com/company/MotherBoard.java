package com.company;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSots = cardSots;
        this.bios = bios;
    }

        public void loadProgram(String programName)
        {
            System.out.println("Program" + "is now loading.....");
        }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSots() {
        return cardSots;
    }

    public String getBios() {
        return bios;
    }
}
