package previous.question;

public  class Car implements Vehicle{
	
	
	String model; 
	String fuelType;
	double rentalRate;
	int numberOfWheels;
	
	Car(String model, String fuelType, double rentalRate, int numberOfWheels){
		this.model = model;
		this.fuelType = fuelType;
		this.rentalRate = rentalRate;
		this.numberOfWheels = numberOfWheels;
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
