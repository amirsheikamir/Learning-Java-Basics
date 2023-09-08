package recursion;
import java.util.*;
// find the even fibonacci series.. 
public class NthFibonacci {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       long n = sc.nextInt();
       System.out.println(fibSeries(n));
    }

     static long fibSeries(long n) {
        if (n == 1)
        return 2;
        if (n == 2)
        return 8;

            return 4 *fibSeries(n-1)+fibSeries(n -2);
        
    }
}