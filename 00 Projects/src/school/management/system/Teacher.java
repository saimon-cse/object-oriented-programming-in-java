package school.management.system;

public class Teacher extends Person {
	
	String employeId;
	String subject;
	
	Teacher(String name, String employeId, int age, String subject){
		super(name, age);
		this.employeId = employeId;
		this.subject = subject;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Employe Id: " + employeId);
		System.out.println("Subject: " + subject);
	}
	
	
	
}
