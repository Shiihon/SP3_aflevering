package org.SP3;

public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm() {
        int whPrKm = getBatteryCapacity() * 1000 / getMaxRange();
        return whPrKm;
    }

    @Override// FIX IT!!!!
    public int getRegistrationFee() {
        int kmPrLitre = (int) (100 / (getWhPrKm() / 91.25));

        if (kmPrLitre >= 20) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBattery capacity: " + getBatteryCapacity() + "\n" +
                "Max range: " + getMaxRange() + "\n" +
                "Registration fee: " + getRegistrationFee();
    }
}
