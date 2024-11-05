package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("AAB", 01);
		student1.show();
		
		Student student2 = new Student("Saimon", 27);
		student2.show();
		
		// in the Dept class the dept variable is static 
		// thats why we can call this without using create object
		System.out.println("Dept Name: "+ Dept.dept);
		
		String depart = Dept.dept;
	}

}
