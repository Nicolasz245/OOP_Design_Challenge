package cpre416assignment1;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private final List<Drivable> parkedVehicles = new ArrayList<>();

    public void parkVehicle(Drivable vehicle) {
        parkedVehicles.add(vehicle);
        System.out.println(vehicle.toString() + " parked.");
    }


    public void listParkedVehicles() {
        System.out.println("Parked vehicles:");
        for (Vehicle v : parkedVehicles) {
            System.out.println(v.getMake() + " " + v.getModel());
        }
    }
}