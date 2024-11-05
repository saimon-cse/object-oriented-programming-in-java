package banking.application;

public class BankingSystem {

	public static void main(String[] args) {
		
		BankAccount savings = new SavingsAccount(500);
		BankAccount checking = new CheckingAccount(300);
		
		try {
			savings.deposite(100);
			savings.withdraw(300);
			savings.withdraw(600); // will throw exception
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checking.deposite(200);
			checking.withdraw(1000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
