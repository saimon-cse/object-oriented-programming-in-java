package pack1;

public class VehicleRentalService {
	 public double rentVehicle(Vehicle vehicle, int days) {
	     vehicle.startEngine();
	     double totalCost = vehicle.getRentalRate() * days;
	     System.out.println("Renting a " + vehicle.getClass().getSimpleName() + " for " + days + " days will cost: " + totalCost + "TK");
	     return totalCost;
	 }
	}


