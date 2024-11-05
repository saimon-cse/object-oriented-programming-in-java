package real.estate.management.system;

public class ResidentialProperty extends Property{
	
	protected int numBedrooms;
	
	ResidentialProperty(String propertyId, String location, int numBedRooms){
		super(propertyId, location);
		this.numBedrooms = numBedRooms;
	}

	public int getNumBedrooms() {
		return this.numBedrooms;
	}
	
	public String toString() {
		return "Residential property - Id: " + propertyId + ", Location: " + location + ", Bedrooms: "+numBedrooms; 
	}
	
	
}
