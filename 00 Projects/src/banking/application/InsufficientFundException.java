package banking.application;

public class InsufficientFundException extends Exception {
	InsufficientFundException(String message){
		super(message);
	}
}
