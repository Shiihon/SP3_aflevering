package org.SP3;

public abstract class AFuelCar extends ACar {
    private final int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType(); //Should return "Gasoline" or "Diesel"

    public int getKmPrLitre() {
        return kmPrLitre;
    }
}
