package recursion.stringOnRecursion;
import java.util.*;
public class RemoveDup {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
          
        RemoveDuplicates(word, 0, "");
    }
        public static boolean[] map = new boolean[26];
    private static void RemoveDuplicates(String word, int i, String checker) {
       // base case 
       if (i == word.length()) {
        System.out.println(checker);
        return ;
       }
       
       
       
        char curChar = word.charAt(i);
        if (map[curChar - 'a'] == true ) {
            RemoveDuplicates(word, i + 1, checker );
        }
        else {
            checker+= curChar;
            map[curChar - 'a'] = true;
            RemoveDuplicates(word, i + 1, checker);
        }
    }
}
