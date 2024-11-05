package pack1;

public class Test {

	public static void main(String[] args) {
		
		Bird bird = new Eagle();
		bird.fly();
		bird.makeSound();
		
		bird = new Hawk();
		bird.fly();
		bird.makeSound();
		
	}

}
