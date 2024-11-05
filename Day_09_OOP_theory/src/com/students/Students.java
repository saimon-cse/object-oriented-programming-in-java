package com.students;

public class Students extends Dept{
	final String name = "AAB";	// final variable
	final int age;	//blank final var
	static final String hometown;	//static final var
	
	Students(){
		// we do initialize the blank final variable in
		// in the constructor section
		age = 20;
	}
//	hometown = "Comilla";
	static {
		hometown = "Dhaka";
	}
	void show() {
		System.out.println("Name: "+name+"\nAge: "+age);
		System.out.println("Hometown: "+hometown);
	}
	
//	void bsmru() {
//		it is not possible. because the bsmru class is final in the parent class.
//		so there can not be override the bsmru class 
//	}
	
	// if the class is final then it cannot be extend 
}
