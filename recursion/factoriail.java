package recursion;
import java.util.*;
public class factoriail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solve(n));
    }
    static int solve(int n) {
    if (n == 1) {
        return 1;
    }
          return  n * solve((n - 1)) ;
    }
}
