package real.estate.management.system;

public class RealEstateManagementSystem {

	public static void main(String[] args) {
		
		 ResidentialProperty resProperty = new ResidentialProperty("ID101", "Downtown", 3);
	     CommercialProperty comProperty = new CommercialProperty("ID202", "City Center", "Retail");
	     
	     double resPropertyValue = 50000;
	     double comPropertyValue = 223000;
	     
	     System.out.println(resProperty);
	     System.out.println("Annual Tax: $"+resProperty.calculateAnnualTax(resPropertyValue));
	     
	     System.out.println(comProperty);
	     System.out.println("Annual Tax: $" + comProperty.calculateAnnualTax(comPropertyValue));
	}

}
