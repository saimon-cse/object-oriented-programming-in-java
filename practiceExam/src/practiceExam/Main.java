package practiceExam;
import java.util.*;

class Main {
	
	
	 static void validateAge(int age) throws MyException {
		if(age < 18) 
			throw new MyException("You are not eligible!");
		else 
			System.out.println("You are eligible.");
	}
	public static void main(String[] args) {
		
		int a = 16, b = 0;
		if(a<11) 
			throw new ArithmeticException("The Number is under 11");
		else System.out.println("Yeaaaaahhhhhh!!");
		
		try {
			validateAge(30);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			int c = b/a;
		}	
//		Vehical te = new Vehical();
	}    
}

class MyException extends Exception {
	MyException(String s){
		System.out.print(s);
	}
}