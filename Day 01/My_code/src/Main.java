//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        //Variable
        /*
         * byte-1 [-128 to 127]
         * short-2
         * int -4
         * long-8
         * float-4
         * double-8
         * char -2
         * boolean-1 true/false
         */

        byte age = 21;
//		int phone = 017145951;
        long phone = 1714595148L;

        // Non- primitive data type
        String name = new String("Saimon Islam");
        System.out.println(name);

        System.out.println(name.length());

        String first = "Saimon";
        String last = "Islam";
        String name1 = first + " " + last;

        System.out.println(name1.charAt(8));

        String name2 = name.replace('I', 'i');

        System.out.println(name1);
        System.out.println(name2);
        
     // Creating and initializing custom character
        char a = 'G';
 
        // Integer data type is generally
        // used for numeric values
        int i = 89;
        byte b = 4;
        short s = 56;
        double d = 4.355453532; 
        // for float use 'f' as suffix as standard
        float f = 4.7333434f; 
        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;
 
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);


    }
}