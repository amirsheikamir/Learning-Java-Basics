import java.util.*;

import OOPS.staticClass;

public class selectionSort {

    static void solve(int[] arr, int n ) {
        for (int i = 0; i < n; i++) {
            // find the max element & swap with correct index 

            int last = n - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }

    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int j = start; j <= end; j++) {
            if(arr[max] < arr[j] ) {
                max = j;
            }
        }
        return max;
     }

    static void swap (int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solve(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
