package org.SP3;

public class DieselCar extends AFuelCar {
    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = getKmPrLitre();
        int registrationFee = 0;

        if (kmPrLitre >= 20) {
            registrationFee = 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            registrationFee = 1050 + 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            registrationFee = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            registrationFee = 5500 + 2770;
        } else {
            registrationFee = 10470 + 15260;
        }
        if (!hasParticleFilter()) {
            registrationFee += 1000;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        String particleFilterStatus = hasParticleFilter() ? "with particle filter" : "without particle filter";
        return super.toString() +
                "\nkmPrLitre: " + getKmPrLitre() + "\n" +
                "Fuel: " + getFuelType() + "\n" +
                "Registration Fee: " + getRegistrationFee() + "\n" +
                particleFilterStatus;
    }
}
