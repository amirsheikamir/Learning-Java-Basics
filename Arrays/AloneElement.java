package Arrays;

import java.util.*;
public class AloneElement {
    // in this problem we have to find unique element in array all other have a duplicate one or paair of element.
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
        sc.close();
    }
}

class Solution
{
    int findOnce(int arr[], int n){
		
		for (int i = 0; i < n; i++) {
		int count = 0;
		for(int j = 0; j < n; j++) {
			if (arr[i] == arr[j]) {
				count++;
			}
		}
			if (count == 1) {
				return arr[i];
			}
		}
		return arr[0];
         // i have come across with two solution 
         
	//======================================
		// int sum = 0;
		// for (int i = 0; i < arr.length; i++) {
		// 	   sum ^= arr[i];
		// }
		// return sum;
    }
}
