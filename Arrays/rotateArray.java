package Arrays;
import java.util.*;

class Solution {
    public static int[] rotate(int arr[], int n) {
        
        //  rotate array by one nuber left
        // int temp = arr[ n - 1];
        
        // for (int i = arr.length - 1; i > 0; i--){
        //     arr[i] = arr[i - 1];
            
        // }
        
        // arr[0] = temp;
        //--------------------------------------------------------------
        // left array rotate 
        int temp = arr[0];
          for (int i = 1; i < n; i++){
            arr[i - 1] = arr[i ];
            
        }
        
        arr[n -1] = temp;
        
        return arr;
    }
}
public class rotateArray {
    // left and right array rotate 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
        sc.close();
		Solution.rotate(arr, n);
		for(int i =0 ;i < n; i++){
            System.out.print(arr[i] +" ");
		    
		}
    }
}
