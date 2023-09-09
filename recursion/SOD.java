package recursion;
import java.util.*;
public class SOD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solve(n));
    }

     static int solve(int n) {
        if ( n < 9) {
            return n;
        }
        return (n % 10 + solve(n / 10));
    }
}
