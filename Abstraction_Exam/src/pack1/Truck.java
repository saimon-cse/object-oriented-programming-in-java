package pack1;


public class Truck implements Vehicle {
 private String model;
 private String fuelType;
 private double rentalRate;
 private int numberOfWheels;
 private double cargoCapacity;

 public Truck(String model, String fuelType, double rentalRate, int numberOfWheels, double cargoCapacity) {
     this.model = model;
     this.fuelType = fuelType;
     this.rentalRate = rentalRate;
     this.numberOfWheels = numberOfWheels;
     this.cargoCapacity = cargoCapacity;
 }

 @Override
 public void startEngine() {
     System.out.println("Truck engine started.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Truck engine stopped.");
 }

 @Override
 public int getNumberOfWheels() {
     return numberOfWheels;
 }

 @Override
 public String getFuelType() {
     return fuelType;
 }

 @Override
 public double getRentalRate() {
     return rentalRate;
 }

 public String getModel() {
     return model;
 }

 public double getCargoCapacity() {
     return cargoCapacity;
 }
}


