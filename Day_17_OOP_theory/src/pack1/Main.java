package pack1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Factorials
		 *
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int num = input.nextInt();

		int result = 1;
		
		for(int i = num; i>0; i--) {
			result *= i;
		}
		
		System.out.println("Factorial of " + num + " is " + result);

	}

}
