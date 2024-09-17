package cs.nyuad.se.factorydemo;

public class TruckLogistics {
    
    private Truck truck;

    public TruckLogistics(Truck truck){
        this.truck = truck;
    }

    public void deliver(String address1, String address2){
        System.out.println(String.format("Truck %s delivering from %s to %s", truck.getVehicleID(), address1, address2));
    }
}
