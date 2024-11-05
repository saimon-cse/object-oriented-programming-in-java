package OOP_theory;

public class Student {
	String name;
	int roll, age;
	float cgpa;
	
	Student(){
		System.out.println("No Information");
	}
	
	Student(String n, int r){
		name = n;
		roll = r;		
	}
	
	Student(String n, int r, int a){
		name = n;
		roll = r;
		age = a;
			
	}
	
	Student(String name, int roll, float cgpa){
		this.name = name;
		this.roll = roll;
		this.cgpa = cgpa;
	}
	
	void showInfo() {
		System.out.println("Name: "+name+"\n"+"Roll: "+roll+"\n"+"Age: "+age+"\n");
	}
	
	void showInfo(int n) {
		System.out.println("Name: "+name+"\nRoll: "+roll+"\nCGPA: "+cgpa);
	}
}
