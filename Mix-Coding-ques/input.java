// since scanner is not present in our rogram, we ned to import it  
// Inside java, we have multiple packages & one of them is  util
// Inside this Util package, we have Scanner class 
// package --> Group of Classes  is called packages

import java.util.Scanner;

// To input anything in java 
// - Import Scanner 
// - Create object of Scanner class 
// - Use different functionalities of Scanner class 

public class Main 
{
    public static void main(String arg[])
    {
        // This line creates object of scanner class 
        Scanner in = new Scanner(System.in);
        
        // RULE -> ClassName objectName = new ClassName(Parameter)
        
        int a = in.nextInt();
        String n = in.next();
        
        System.out.println(a);
        System.out.println(n);
    }
}