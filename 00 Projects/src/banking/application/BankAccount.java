package banking.application;

public abstract class BankAccount {
	protected double balance;
	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	void deposite(double amount) {
		if(amount >= 0)
			this.balance += amount;
	}
	
	public abstract void withdraw(double amount) throws InsufficientFundException;
	
	
}
