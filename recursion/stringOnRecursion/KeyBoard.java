package recursion.stringOnRecursion;
import java.util.*;
public class KeyBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        solve(str, 0 , "");
    }

    public static String[] keypad  = {"." , "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu" , "vwx", "yz"};

     static void solve(String str, int i, String Combination) {
     // base case
         if (i == str.length()) {
            System.out.println(Combination);
            return ;
         }
        // current char 
        char currchar = str.charAt(i);
        // check current char in currchar
        String maping = keypad[currchar - '0'];

        for (int j = 0; j < maping.length(); j++) {
        solve(str, i + 1, Combination + maping.charAt(j));
        }
    }
}