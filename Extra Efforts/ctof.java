import java.util.*;

public class ctof
{
    public static void main (String args[])
    {
        Scanner temp = new Scanner(System.in);
        
        double a = temp.nextDouble();
       double b = (a * 9/5 )+32;
        
      System.out.println("Converted Temprature of Celcius to Fahrenhite is :" +b);
    }
}