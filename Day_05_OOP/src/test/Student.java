package test;

public class Student {
	static String name;
	static int roll;
	static int n;
	
	String dept = "CSE";
	
	Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	
	static {
		n = 555;
		// in the Static section we cannot call not static variable
		//System.out.println("Dept: "+ dept); 
		
	}
	
	// we use here name and roll var because they are static var.
	static void show() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll)
;	}
}
