package recursion;
import java.util.*;
public class eMazePath {
   
    static int countPath(int i, int j,int n ,int m) {
        if (i ==n || j == m ) {
            return 0;
        }
        //base cae 1
       if ( i == n - 1 &&  j == m -1) {
        return 1;
       }
        // move downwards 
        int moveDown = countPath(i + 1, j, n, m);
        // move right 
        int rightMove = countPath(i, j + 1, n, m);

        return moveDown + rightMove;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


    int totalpaths = countPath(0, 0, n, m);
    System.out.println(totalpaths);
    }
}
