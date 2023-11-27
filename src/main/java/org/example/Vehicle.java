package org.example;

public class Vehicle {
    private String brand;
    private String modell;
    private int buildYear;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void printData() {
        System.out.println("Fahrzeug der Marke " + brand + " mit Modell " + modell + " und Jahr " + buildYear);
    }
}
