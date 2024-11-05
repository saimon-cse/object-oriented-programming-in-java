package school.management.system;

public class SchoolManagementSystem {

	public static void main(String[] args) {
		
		Student std1 = new Student("Alice", 15, "S12345"); // name, age, student id
		std1.addGrade(2);
		std1.addGrade(10);
		
		std1.displayInfo();
		
		Teacher teacher = new Teacher("AAB", "T001", 31, "OOP"); // name, employeid, age, subject
		teacher.displayInfo();
	}

}
