package org.SP3;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();


    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for (Car car : fleet) {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        String carsInList = "";
        for (Car car : fleet)
            carsInList += car + "\n\n";
        return carsInList + "There are a total of " + fleet.size() + " cars." + "\nTotal registration fee for the fleet " + getTotalRegistrationFeeForFleet();
    }
}
