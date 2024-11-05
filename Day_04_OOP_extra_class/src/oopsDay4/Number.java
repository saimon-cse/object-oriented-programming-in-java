package oopsDay4;

public class Number {
	
	//method overloading
	void addition(int a, int b) {
		System.out.println(a + b);
		
	}
	
	void addition(double a, double b) {
		System.out.println(a+b);
	}
	
	//it is not possible because of changing the return type
// for overloading the parameter must be different  
//	int addition(double a, double b) {
//		System.out.println(a+b);
//	}
	
	void addition() {
		System.out.println("Nothing to show");
	}
	
	
	int multiply(int a, int b) {
		return a * b;
	}
	
	int squre(int a) {
		return a*a;
	}
	
	
}
