package org.example;

public class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void printData() {
        System.out.println("Fahrzeug der Marke " + getBrand() + " mit Modell " +
                getModell() + " und Jahr " + getBuildYear() +
                " und weil es ein Auto ist: das Auto hat " + numberOfDoors + " Türen");
    }

}
