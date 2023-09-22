package recursion.stringOnRecursion;
import java.util.*;
public class permutation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         solve(str, " " );
         sc.close();
    }

     static void solve(String str, String per) {

        // base condition 
        if (str.length() == 0) {
            System.out.println(per.trim());
            return;
        }   
        
        for (int i = 0; i < str.length(); i++) {
                
                char currchar = str.charAt(i);
                // T.C 0(n!);
                String str1 = str.substring(0, i) + str.substring(i + 1);
                solve(str1, per + currchar);
            }
    }
}
