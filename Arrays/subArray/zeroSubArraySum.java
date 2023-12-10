package Arrays.subArray;

import java.util.*;

public class zeroSubArraySum {
    // i find  all sum of sub array and check if sub array sum has become 0
    static void sumOfSubarray(int[] arr, int n ) {
        for (int i = 07; i < n; i++) {

            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];

                if (sum == 0) {
                    System.out.println(i +" " + j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            sc.close();

    }
}
