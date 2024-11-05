package practiceExam;

public class Dog extends Mamal{
	String name = "Dog";
	void sound() {
		super.name = "Mamal-Dog";
		super.sound();
		System.out.println(super.name);
	}
}
