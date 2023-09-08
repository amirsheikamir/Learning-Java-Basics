package recursion;

import java.util.*;

public class multi{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n=scn.nextInt();
       int m = scn.nextInt();
       int sum = 0;

               System.out.println(recmul(n, m));
    }

     static int recmul(int n, int m) {
        if (n == 0 || m <= 0){
            return 0;
    }
        return n + recmul( n, m - 1);

}
}