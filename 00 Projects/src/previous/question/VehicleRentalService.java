package previous.question;

public class VehicleRentalService {
//	int days;
//	VehicleRentalService(Vehicle vehical, int days){
//		this.days = days;
//	}
	
	void rentVehicle(Vehicle vehicle, int days) {
		System.out.println("Total Rent: " + days * vehicle.getRentalRate());
		vehicle.startEngine();
	}
	
	
}
