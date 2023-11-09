package org.SP3;

import java.text.NumberFormat;
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

    public void loadCars(ArrayList<String> cars) {
        for (String line : cars) {
            String[] carInfo = line.split(",");

            if (carInfo.length >= 6) {
                String type = carInfo[0].trim();
                String registrationNumber = carInfo[1].trim();
                String make = carInfo[2].trim();
                String model = carInfo[3].trim();
                int numberOfDoors = Integer.parseInt(carInfo[4].trim());

                Car car = null;

                if (type.equals("Gasoline") && carInfo.length == 6) {
                    int kmPerLitre = Integer.parseInt(carInfo[5].trim());
                    car = new GasolineCar(registrationNumber, make, model, numberOfDoors, kmPerLitre);

                } else if (type.equals("Diesel") && carInfo.length == 7) {
                    int kmPerLitre = Integer.parseInt(carInfo[5].trim());
                    boolean hasParticleFilter = Boolean.parseBoolean(carInfo[6].trim());
                    car = new DieselCar(registrationNumber, make, model, numberOfDoors, kmPerLitre, hasParticleFilter);

                } else if (type.equals("Electric") && carInfo.length == 7) {
                    int batteryCapacity = Integer.parseInt(carInfo[5].trim());
                    int maxRange = Integer.parseInt(carInfo[6].trim());
                    car = new ElectricCar(registrationNumber, make, model, numberOfDoors, batteryCapacity, maxRange);
                }

                if (car != null) {
                   addCar(car);
                }
            }
        }
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        String carsInList = "";
        for (Car car : fleet)
            carsInList += car + "\n\n";
        return carsInList + "There are a total of " + fleet.size() + " cars." + "\nThe total registration fee for the fleet is  " + formatter.format(getTotalRegistrationFeeForFleet());
    }
}
