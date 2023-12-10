package BinarySearch;

import java.util.*;
class Solution {
    public static int rel(int n , int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid; // Return the index of the target value
            } else if (arr[mid] < target) {
                low = mid + 1; // Update the lower bound
            } else {
                high = mid - 1; // Update the upper bound
            }
        }
        return -1; // Return -1 if the target value is not found
    }
}
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        int target = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(Solution.rel(n, arr, target));
    }
}
