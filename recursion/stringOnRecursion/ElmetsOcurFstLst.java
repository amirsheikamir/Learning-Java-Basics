package recursion.stringOnRecursion;
import java.util.*;

//  In this code we find the any character we want where they are in indices of that character...
public class ElmetsOcurFstLst {
     public static int first = -1;
    public static int last = -1;
    static void solve(String str, int i, char element) {
        if (i == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
    
        char currchar = str.charAt(i);
        if(currchar == element) {
          if (first == -1) {
            first = i;
          }else{
            last = i;
          }
        }
        solve(str, i + 1, element);
 }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String str=scan.nextLine();
         char el = 'e';
            solve(str ,0, el);
    }
}
