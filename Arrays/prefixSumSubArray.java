package Arrays;
// better code of sum of sub array as we now our previous code T.C = n3  but in this code T.C is n2;

import java.util.*;

public class prefixSumSubArray {

    static void prefixSum (int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i -1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j <arr.length; j++) {
                int end = j;
                if ( start == 0) {
                        currSum += prefix[end];
                    
                }else {
                currSum = prefix[end] - prefix[start -1];
                }

                System.out.println(currSum);

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println(maxSum+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        prefixSum(arr);
    }
}
