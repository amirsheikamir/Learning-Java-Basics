package recursion;
import java.util.*;
public class Guest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int Guests = Invite( n );
       System.out.println(Guests);
    }

     static int Invite(int n) {
        //base case 
        if (n <= 1) {
            return 1;
        }

        // if we invite guest single .
        int ways_1 = Invite(n - 1);
        // if we invite them in pair 
        int ways_2 = (n - 1) * Invite(n - 2);

        return ways_1 + ways_2;
    }
}
