package recursion.stringOnRecursion;
import java.util.*;
public class CountX {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int n = str.length();
            System.out.println(countX(str,0,n));
    }

     static int countX(String str, int i, int n) {
       // base case here n is the length of str.
        if ( i == n)
        return 0;
        // curr state
        int cnt = 0;
        if (str.charAt(i) == 'x') {
                cnt++;
        }
        //        recursive call for next index and add it to current value
        int remcnt = countX(str, i + 1, n);
        return cnt + remcnt;
    }
}
