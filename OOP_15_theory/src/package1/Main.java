package package1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Even - odd checking
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("This is an Even number");
		}
		else {
			System.out.println("This is an odd number");
		}
		
		
		/*
		 * Calculate Sum of some number
		 */
		
		System.out.print("How may number: ");
		int n = input.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			int temp = input.nextInt();
			sum += temp;
		}
		
		System.out.print("Sum: " + sum + "\n");
		
		
		
		/*
		 * Alphabet Checking
		 * Vowel - Consonant
		 */
		
//		char ch = 'h';
		System.out.print("Enter a Character: ");
		char ch = input.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
			System.out.println("The char is Vowel");
		}
		else {
			System.out.println("The char is Consonant");
		}
		
		
		
		/*
		 * Switch 
		 */
		
		System.out.print("Enter a Character: ");
		char cha = input.next().charAt(0);
		
		switch(cha) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(cha + " is a vowel");
			break;
			
		default:
			System.out.println(cha + " is a consonant");
		}
		

	}

}
