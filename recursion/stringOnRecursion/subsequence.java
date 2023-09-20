package recursion.stringOnRecursion;
import java.util.*;
public class subsequence {

    /*  What is subssequences : let's suppose we have a string "abc". if we want some charatcer only 
        we can pick a character or not pick a character that is choice of our's but if any character 
        we pick but the thing is which ever character we get order should follow.
        e,g :   case: abc  -- >  ab, ac, bc, b, c, 
        Always follow order... 
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sub = scan.nextLine();

        SubSeq(sub, 0, "");
    }

    private static void SubSeq(String sub, int i, String test) {
       // base case 
        if (i == sub.length()) {
            System.out.println(test);
            return ;
        }

        // find curr char 
        char currchar = sub.charAt(i);

        // pick char
        SubSeq(sub, i + 1, test + currchar);

        // or not pick char
        SubSeq(sub, i + 1, test);
    }
}
