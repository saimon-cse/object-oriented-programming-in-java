package OOP_theory;

public class Car {
	int wheel;
	String color;
	
//	Car(int w, String c){
//		wheel = w;
//		color = c;
//	}
	
	Car(int wheel, String color){
		this.wheel = wheel;
		this.color = color;
	}
	
	void carInfo() {
		System.out.println("Wheel: "+wheel+"\nColor: "+color+"\n");	
	}
	
}
