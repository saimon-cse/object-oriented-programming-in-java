package OOP_theory;

public class Test {

	public static void main(String[] args) {
		// Constractor 
		
		Student student2 = new Student();
		student2.showInfo();
		
		Student student3 = new Student("Ehasan Mahmud", 26);
		student3.showInfo();
		
		Student student4 = new Student("Debodyan Deb", 8, 22);
		student4.showInfo();
		
		Student student5 = new Student("Saimon Islam", 27, 3.52f);
		student5.showInfo(0);
	}

}
