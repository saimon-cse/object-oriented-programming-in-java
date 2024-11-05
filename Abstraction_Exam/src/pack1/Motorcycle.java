package pack1;

public class Motorcycle implements Vehicle {
	 private String model;
	 private String fuelType;
	 private double rentalRate;
	 private int numberOfWheels;
	 private boolean hasSidecar;

	 public Motorcycle(String model, String fuelType, double rentalRate, int numberOfWheels, boolean hasSidecar) {
	     this.model = model;
	     this.fuelType = fuelType;
	     this.rentalRate = rentalRate;
	     this.numberOfWheels = numberOfWheels;
	     this.hasSidecar = hasSidecar;
	 }

	 
	 public void startEngine() {
	     System.out.println("Motorcycle engine started.");
	 }

	 
	 public void stopEngine() {
	     System.out.println("Motorcycle engine stopped.");
	 }

	 
	 public int getNumberOfWheels() {
	     return numberOfWheels;
	 }

	 
	 public String getFuelType() {
	     return fuelType;
	 }

	 
	 public double getRentalRate() {
	     return rentalRate;
	 }

	 public String getModel() {
	     return model;
	 }

	 public boolean hasSidecar() {
	     return hasSidecar;
	 }
	}


	