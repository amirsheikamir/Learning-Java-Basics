import java.util.*;

public class MergeSort {
    static void conquer(int[] arr , int s, int mid, int e) {

        int[] merger= new int[e - s + 1];
        int idx = s;
        int idx1 = mid + 1;

        int x = 0;
        while(idx<= mid && idx1 <= e) {
            if (arr[idx] <= arr[idx1]) {
                merger[x++] = arr[idx++];
            }else {
                merger[x++] = arr[idx1++];
            }
        }

    }
    static void mergeSort(int[] arr, int n, int s, int e) {

        if (s > e) {
            return;
        }
       
        mid = s + (e + s) / 2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);
        conquer (arr, s mid, e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        mergeSort(arr, n);
    }
}
