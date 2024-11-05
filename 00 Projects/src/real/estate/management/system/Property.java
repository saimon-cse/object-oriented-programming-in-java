package real.estate.management.system;

public class Property {
	protected String propertyId;
	protected String location;
	final double PROPERTY_TAX_RATE = 0.01; // Example: 1% tax rate
	
	
	Property(String propertyId, String location){
		this.propertyId = propertyId;
		this.location = location;
	}
	
	public double calculateAnnualTax(double propertyValue) {
		return this.PROPERTY_TAX_RATE * propertyValue;
	}
	
	public String getPropertyId() {
		return this.propertyId;
	}
	
	public String getPropertyLocation() {
		return this.location;
	}
	
}
