package recursion;
import java.util.*;
public class printReverseNum {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int[] arr = printNos(x);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }

        public static int[] printNos(int x) {
            int[] arr = new int[x];
            int i = x;
            return solve(x, arr, x - 1);
        }
        static int[] solve(int x, int[] arr, int i) {
            if ( i < 0) {
                return new int[0];
            }
            // print arr in reverse order
            arr[x - 1 - i] = i + 1;
            solve(x, arr, i - 1);
            return arr;
        }

    }
