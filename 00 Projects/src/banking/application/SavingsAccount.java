package banking.application;

public class SavingsAccount extends BankAccount{
	
	SavingsAccount(double balance){
		super(balance);
	}
	


	@Override
	public void withdraw(double amount) throws InsufficientFundException {
		if(balance < amount)
			throw new InsufficientFundException("You do not have enough money.");
		
		balance -=  amount;
		System.out.println("Withdrawn: $" + amount);
	}

	
}
