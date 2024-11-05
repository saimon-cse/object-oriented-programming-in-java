package banking.application;

public class CheckingAccount extends BankAccount {
	private double OVERDRIFT_amount = 100;
	
	CheckingAccount(double balance){
		super(balance);
	}
	
	public void withdraw(double amount) throws InsufficientFundException {
		if(balance + OVERDRIFT_amount < amount)
			throw new InsufficientFundException("Overdrift limit excced");
		
		balance -= amount;
		System.out.println("Withdrawn: $" + amount);
		
	}
}
