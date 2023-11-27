package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle danielsBike = new Vehicle();
        danielsBike.setBrand("BikeX");
        danielsBike.setModell("Männerfahrrad 37");
        danielsBike.setBuildYear(2010);

        Vehicle bastiansBike = new Vehicle();
        bastiansBike.setBrand("Coop");
        bastiansBike.setModell("Leopard");
        bastiansBike.setBuildYear(2021);

        danielsBike.printData();
        bastiansBike.printData();

        Car danielsCar = new Car();
        danielsCar.setBrand("Skoda");
        danielsCar.setModell("Octavia III");
        danielsCar.setBuildYear(2014);
        danielsCar.setNumberOfDoors(5);

        danielsCar.printData();




    }
}