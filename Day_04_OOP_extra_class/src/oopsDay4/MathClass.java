package oopsDay4;
//import java.util.*;
import java.util.Scanner;

public class MathClass {
	public static void main(String[] args) {
		System.out.println(Math.abs(-25.44));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.PI);
		System.out.println(Math.log(1));
		System.out.println(Math.exp(1));
		System.out.println(Math.min(-9, -2));
		System.out.println(Math.max(-4, -3));
		System.out.println(Math.ceil(-4.2));
		System.out.println(Math.floor(-5.4));
		System.out.println(Math.abs(-4));
		
		
		
		Number num1 = new Number();
		num1.addition();
		num1.addition(4,6);
		num1.addition(4.6, 11.4);
				
		Number num2 = new Number();
		System.out.println("Value of the  mathod: "+num2.multiply(2,4));
		
		System.out.print("Take an input: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("Value: "+num2.squre(n));
		
		Scanner var = new Scanner(System.in);
		int a = var.nextInt();
		
		Scanner S = new Scanner(System.in);
		int sm = S.nextInt();
	}
}
