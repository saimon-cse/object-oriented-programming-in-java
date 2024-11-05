package constractor;

public class Student extends Person {
	int roll;
	Student(String n, int a, int r){
		super(n, a);  //pass the parameter to the parent class
		roll = r;
	}
	
	Student(String name, int age, int roll, int cgpa){
		super(name, age);
		this.roll = roll;
//		this.cgpa = cgpa;
		
	}
	
	void show() {
		super.show(); // call the show method from the parent
		System.out.println("Roll: "+roll);
	}
}
