package package2;

import package1.*;  // access  the package 1

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1 = new A(); // access class A from same package
		obj1.print();
		
		
		package1.A obj2 = new package1.A(); // make a obj using package1 class
		obj2.print();
		

	}

}
