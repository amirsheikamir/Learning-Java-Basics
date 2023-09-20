package recursion.stringOnRecursion;
import java.util.*;

import recursion.sortedArray;

public class MoveXElementsLast {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n=scn.nextLine();
        moveX(n, 0, 0, " ");
    }

    static void  moveX(String n, int i, int count, String test) {
        // base case :
        if (i == n.length()) {
        for (int j = 0; j <count; j++) {
            test+= 'x';
        }
        System.out.println(test.trim());
            return ;
        }

        char currchar = n.charAt(i);
        if (currchar == 'x') {
            count++;
            moveX(n, i + 1, count, test);
        }else{
            test+=currchar;
            moveX(n, i+ 1, count, test);
        }
    }
}
