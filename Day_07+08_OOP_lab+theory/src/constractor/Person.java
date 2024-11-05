package constractor;

public class Person {
	String name;
	int age;
	int cgpa;
	Person(){
		
	}
	Person(String n, int a){
//		System.out.println("Person const");
		name = n;
		age = a;
	}
	
	void show() {
		System.out.println("Name: "+name);
		System.out.println("Age:"+age);
	}
}
