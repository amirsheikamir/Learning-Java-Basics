package Arrays;
import java.util.*;
public class reverseArray {
  static void revArray(int[] arr) {
        swap(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
  }

  static void swap(int[] arr) {

    int start = 0;
    int end = arr.length - 1;

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
       
        revArray(arr);

    }
}
