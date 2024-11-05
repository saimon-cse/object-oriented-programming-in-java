package library.inventory.system;

interface Borrowable {
	
	void borrowItem();
	void returnItem();
	boolean isAvailable();
	String getInfo();
}
