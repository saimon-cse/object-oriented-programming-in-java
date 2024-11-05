package pack1;

public class Main {
	 public static void main(String[] args) {
	     Vehicle car = new Car("BMW", "Gasoline", 30.0, 4);
	     Vehicle truck = new Truck("TATA", "Diesel", 80, 6, 1000.0);
	     Vehicle motorcycle = new Motorcycle("Honda", "Gasoline", 40.0, 2, true);

	     VehicleRentalService rentalService = new VehicleRentalService();
	     rentalService.rentVehicle(car, 5);
	     rentalService.rentVehicle(truck, 3);
	     rentalService.rentVehicle(motorcycle, 7);
	 }
	}
