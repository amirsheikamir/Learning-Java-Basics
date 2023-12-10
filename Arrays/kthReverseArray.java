package Arrays;

import java.util.Scanner;
//  rotate array left;
public class kthReverseArray {
     static void revArray(int[] arr, int k) {

        k = k % arr.length;  // if the array is greater than length of array it will handle it by taking modulo  
        swap(arr, 0, k -1 );   // first element swap 

        swap(arr, k, arr.length- 1);  // swap remaining array    arr 2 n -1     2 1 3 4 5
        
        swap(arr, 0, arr.length - 1);  // reverse all  elements of array 
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }                                                        
  }
                                                               
  static void swap(int[] arr, int start, int end ) {


    while (start < end) {
        int temp =  arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
  }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();

       int[] arr = new int[n];
       for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
       }
       int k = sc.nextInt();
        revArray(arr, k);

    }
}
