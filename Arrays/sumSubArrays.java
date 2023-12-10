package Arrays;

import java.util.Scanner;

public class sumSubArrays {

    static void ssA(int[] arr) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                currSum = 0;
              for (int k = start; k <= end; k++) {
                currSum+= arr[k];
              }
              System.out.println(currSum); 
              if(maxSum < currSum) {
                maxSum = currSum;
              }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ssA(arr);
    }
}
