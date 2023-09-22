package recursion;
import java.util.*;
public class TilesPlacements {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int resut = Solve(n, m);
      System.out.println(resut);
 }

     static int Solve(int n, int m) {
        // two base cases are there 
        // firrst 
        if ( n == m ) {
            return 2;
        }
        // second
        if ( n < m ) {
            return 2;
        }



        // place vertically 
        int vertiPlace = Solve(n - m, m);
        // place horizentatlly 
        int horiPlace = Solve(n - 1, m);

        return vertiPlace + horiPlace;
    }
}
