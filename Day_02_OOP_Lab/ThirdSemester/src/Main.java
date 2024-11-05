
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Student 1
        Student student1 = new Student();
        student1.name = "Saimon Islm";
        student1.roll = 27;

//		System.out.println("Name: "+ student1.name);
//		System.out.println("Roll: " + student1.roll);

        student1.showInfo();

        // Student 2
        Student student2 = new Student();
        student2.name = "Deb";
        student2.roll = 7;
//		System.out.println("Name: " + student2.name);
//		System.out.println("Roll: "+student2.roll);
        student2.showInfo();

        //Student 3
        Student student3 = new Student();
        student3.setInfo("Aupo", 01);
        student3.showInfo();

        // Student 4
        Student student4 = new Student();
        student4.setInfo("Ehasan", 26);
        student4.showInfo();

    }

}
