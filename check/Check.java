package check;
import java.io.*;
import java.util.*;

class Solution {
    public boolean targetSum(int start, int[] nums, int target) {
		boolean flag = false;
		for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                
                    flag = true;
                    break;
                }
            }
        }
        
    }
}

class Check {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.targetSum(0, arr, target));
        sc.close();
    }
}