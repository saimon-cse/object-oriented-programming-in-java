package previous.question;

public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car("BMW", "LPG", 20.4, 4);
		VehicleRentalService rent = new VehicleRentalService();
		
		rent.rentVehicle(vehicle, 10);

	}

}
