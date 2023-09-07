import java.util.*;

public class ftoc
{
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();

        double c = (( a - 32)* 5)/9 ;
        
        System.out.println("Converted Temparature of Fahrenheit to Celcius : " + c );
    }
}
