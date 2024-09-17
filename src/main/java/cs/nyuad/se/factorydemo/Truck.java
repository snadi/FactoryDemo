package cs.nyuad.se.factorydemo;

import java.util.Date;

public class Truck {
    private String vehicleID;
    private String homeGarage;

    public Truck(String vehicleID, String homeGarage) {
        this.vehicleID = vehicleID;
        this.homeGarage = homeGarage;
    }

    public String getVehicleID() {
        return vehicleID;
    }
    
}
