package real.estate.management.system;

public class CommercialProperty extends Property{
	protected String businessType;
	
	CommercialProperty(String propertyId, String location, String businessType){
		super(propertyId, location);
		
		this.businessType = businessType;
	}
	
	public String getBussinessType() {
		return this.businessType;
	}
	
	public String toString() {
		return "Commercial Property - ID: " + propertyId + ", Location: " + location + ", Bussiness Type: " + businessType;
	}
}
