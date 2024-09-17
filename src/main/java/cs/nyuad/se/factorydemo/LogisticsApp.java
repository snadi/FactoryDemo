package cs.nyuad.se.factorydemo;
import java.util.Date;


public class LogisticsApp {
    public static void main(String[] args) {

        //let's pretend we know which truck we will use
        Truck truck = new Truck("1234", "Jebel Ali");

        while(true){
            System.out.println("Enter address 1 (or exit to exit): ");
            String address1 = System.console().readLine();
            if(address1.equals("exit")){
                break;
            }
            System.out.println("Enter address 2: ");
            String address2 = System.console().readLine();
            
            TruckLogistics truckLogistics = new TruckLogistics(truck);
            truckLogistics.deliver(address1, address2);
        }
    }
}
