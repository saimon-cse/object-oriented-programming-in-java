package Abstraction;

public class Main {

	public static void main(String[] args) {
		
//		A obj = new A(); // eita hobe na bcz abstract can not be instantiated 
		
		A obj; // eita possible bcz reference variable
		obj = new B();
		obj.method1();
		obj.method2();
		
		obj = new C();
		obj.method1();
		obj.method2();
		
	}

}
