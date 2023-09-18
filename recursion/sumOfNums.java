package recursion;
import java.util.*;
public class sumOfNums {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(solve(n)); 
        
    }

     static int solve(int n) {
        if ( n == 0) {
            return 0;
        }

       return n +  solve(n - 1);
        
    }

}
