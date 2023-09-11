package recursion.stringOnRecursion;
import java.util.*;
public class NoX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println(removex(s));
    }
    static String removex(String s) {
        // we are creating a new finction because 
        // we have give only string for iterating value we need int.
       return solve(s, 0);
    }
     static String solve(String s, int i) {
       // base condition....
        if (i == s.length()){
            return "";
        }
        // curr state
        String removex = "";
            if (s.charAt(i) != 'x') {
                // remove x from string 
             removex+= s.charAt(i);
            }

            // recursive call...
            String remchar = solve(s, i + 1);
                // adding both and return 
            return  removex + remchar;
    }
}
