package Arrays;

import java.util.Scanner;
// actualy this is left rotated 
public class kthRightRotate {

    static void rightRotate(int[] arr, int k) {

        int n = arr.length;
        swap(arr, 0, n - k - 1 );   

         swap(arr,n - k, n - 1);   
        
        swap(arr, 0 ,n - 1);  

    }

    static void swap(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
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

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rightRotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
