package org.SP3;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> data = FileIO.loadData("data/cars.txt");
        FleetOfCars fleet = new FleetOfCars();
        fleet.loadCars(data);

        System.out.println(fleet);
    }
}
