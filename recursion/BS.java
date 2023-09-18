package recursion;
import java.util.*;

  public class BS {
    // Binary Search in java
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ;i<arr.length; ++i) {
            arr[i] = sc.nextInt();
      } 
         System.out.println(solve(arr, target , 0 , arr.length - 1));
   }

     static int solve(int[] arr, int target, int s, int e ) {
        // base 
        if (s > e) {
            return -1;
        }
        int m = s + ( e - s) / 2 ;
        if ( arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return solve(arr, target, s, m - 1);
        }
        return solve(arr, target, m + 1, e);

    }
}