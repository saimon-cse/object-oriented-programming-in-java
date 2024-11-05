package previous.question;

public class Truck implements Vehicle{
	
	
	String model; 
	String fuelType;
	double rentalRate;
	int numberOfWheels;
	double cargoCapacity;
	
	Truck(String model, String fuelType, double rentalRate, int numberOfWheels, double cargoCapacity){
		this.model = model;
		this.fuelType = fuelType;
		this.rentalRate = rentalRate;
		this.numberOfWheels = numberOfWheels;
		this.cargoCapacity = cargoCapacity;
	}
	
	public void startEngine() {
		System.out.println("Car Engine Start.");
	}
	public void stopEngine() {
		System.out.println("Car Engine stop");
	}
	
	
	public int getNumberOfWheels() {
		return this.numberOfWheels;
		
	}
	
	public String getFuelType() {
		return this.fuelType;
		
	}
	
	public double getRentalRate() {
		return this.rentalRate;
		
	}
	
}
