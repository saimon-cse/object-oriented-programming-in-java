package multiLevelInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X obj1 = new X();
		Y obj2 = new Y();
		Z obj3 = new Z();
		
		System.out.println(obj1 instanceof X);
		System.out.println(obj1 instanceof Y);
		System.out.println(obj3 instanceof Y);
		System.out.println(obj3 instanceof X);
		System.out.println(obj2 instanceof Y);
	}

}
