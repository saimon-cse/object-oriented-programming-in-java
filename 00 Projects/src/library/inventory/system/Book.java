package library.inventory.system;

public class Book implements Borrowable{
	String author;
	String title;
	boolean isAvailable;
	
	public void borrowItem() {
		
	}
	
	public void returnItem() {
		
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
