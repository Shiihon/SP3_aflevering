package org.SP3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(new GasolineCar("IN 23 8475", "BMW", "520d", 5, 14));
        fleet.addCar(new GasolineCar("BK 23 9071", "Mercedes", "GLE", 5, 35));
        fleet.addCar(new GasolineCar("AU 50 0835", "Dacia", "Duster Prestige", 5, 10));

        fleet.addCar(new DieselCar("UP 29 8904", "Dacia", "Duster", 5, 19, true));
        fleet.addCar(new DieselCar("PO 93 8720", "Fiat", "500", 3, 25, false));
        fleet.addCar(new DieselCar("UN 29 8904", "BMW", "X5", 5, 15, false));

        fleet.addCar(new ElectricCar("EN 21 1098", "Hyundai", "Kona", 5, 64, 449));
        fleet.addCar(new ElectricCar("DA 26 8946", "Seat", "Mii ELECTRIC", 3, 37, 260));
        fleet.addCar(new ElectricCar("KP 11 0982", "Citroën", "ë-C4 ELECTRIC", 5, 15, 343));

        System.out.println(fleet);
    }
}
// lav scanner der læser fil, hvortil man adder bilerne igennem. Til på Torsdag!