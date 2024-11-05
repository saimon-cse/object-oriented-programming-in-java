package inventory.with.file.handling;

public class OutOfStockException extends Exception {
	
	OutOfStockException(String message){
		super(message);
	}
}
