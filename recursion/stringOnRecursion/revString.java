package recursion.stringOnRecursion;
import java.util.*;
public class revString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            String name = scn.nextLine();
            solve(name, name.length() - 1);
    }

     static void solve(String name, int index) {
        if (index == 0) {
            System.out.print(name.charAt(index)+" ");
            return ;
        }

        System.out.print(name.charAt(index)+ " ");
        solve(name, index - 1);
    }
}
