package recursion;
import java.util.*;
public class productOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(productOf(n));

        }

     static int productOf(int n) {
        if ( n == 1) {
            return 1;
        }
        return   n * productOf(n -1 );
    }
}
