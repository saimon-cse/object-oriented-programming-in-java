package package1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Exception Handling   
		 * 
		 */
		
		
		/*
		 * Exception 1
		 */
		try {
			int x = 100;
			int y = 0;
			int result =  x/y;
			System.out.println("The output is: " + result);
			
			
		}
//		catch(ArithmeticException temp) {
//			System.out.println("Exception name is: " + temp);
//		} // it will works!!
		
		/*
		 * catch(ArrayIndexOutOfBoundsException temp) {
			System.out.println("Exception name is: " + temp);
			} 
			
			sudu eita dile exception handle hobe na. bcz ei perameter ta exception catch korte parteche na
		 */
		
		catch(ArithmeticException temp) {
			System.out.println("Exception name is: " + temp);
		}
		catch(Exception temp) { // Exception's Hierarchy is top most
			System.out.println("Exception name is: " + temp);
		} 	
		
		/*
		 * uporer catch block ar modde "Exception" sob theke upore dile error asbe
		 */
		finally {
			System.out.println("Final Block!!");
		}
		
		
		
		/*
		 * Exception 2
		 */
		try {
			int [] arr = new int[10];
			arr[20] = 200;
		}
		catch(ArrayIndexOutOfBoundsException temp) {
			System.out.println("Exception name is: " + temp);
			}
		catch(Exception temp) { // Exception's Hierarchy is top most
			System.out.println("Exception name ----: " + temp);
		} 	
		
		
		
		
		/*
		 * Exception 3
		 */
		
		try {
			
			String greeting = "Hello";
			System.out.println(greeting.charAt(100));
			
		}
		catch(StringIndexOutOfBoundsException temp) {
			System.out.println("Exception name is: " + temp);
		}
		
	}

}
