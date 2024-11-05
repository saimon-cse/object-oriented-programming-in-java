package throw_throws;
public class TestThrows {
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }
    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.divideNum(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0");
        }
        System.out.println("Rest of the code..");
        
        
        /*
         * start Use of "throw keyword"
         * Forcefully create a Exception case
         */
        
        try {
        	TestThrows obj2 = new TestThrows();
            obj2.checkNum(-3);
        }catch(Exception e) {
        	System.out.println("Exception name: "+ e);
        }
        System.out.println("Rest of the code..");
    }
    
    
    public static void checkNum(int num) {
        if (num < 1) {/** Forcefully create a Exception case*/
            throw new ArithmeticException("Number is negative, cannot calculate square");
        } else {
            System.out.println("Square of " + num + " is " + (num * num));
        }
    }
    /*end use of throw keyword*/
    
}
