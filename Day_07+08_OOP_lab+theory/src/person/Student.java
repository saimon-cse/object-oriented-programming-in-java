package person;

public class Student extends Person {
	int roll;
		
//	void show() {
////		
//		System.out.println("Name: "+ name+ "\nAge: "+ age);	 
//		System.out.println("Roll: "+ roll);
//	}
	
	void show() {
		super.show();	// "super" using this key word we can access the parent class
		System.out.println("Roll: "+ roll);
	}
}
