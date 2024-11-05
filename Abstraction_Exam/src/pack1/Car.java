
package pack1;

public class Car implements Vehicle {
 private String model;
 private String fuelType;
 private double rentalRate;
 private int numberOfWheels;

 public Car(String model, String fuelType, double rentalRate, int numberOfWheels) {
     this.model = model;
     this.fuelType = fuelType;
     this.rentalRate = rentalRate;
     this.numberOfWheels = numberOfWheels;
 }

 @Override
 public void startEngine() {
     System.out.println("Car engine started.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Car engine stopped.");
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
}
