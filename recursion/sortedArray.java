package recursion;
import java.util.*;
public class sortedArray {

    // question solved but need more improvement just try to get user input
    // then sort or not check...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 3, 3};
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i : arr) {
        //     arr[i] = sc.nextInt();
        // }

       System.out.println(isSorted(arr, 0));
    }

     static boolean isSorted(int[] arr, int i) {
       // base Case
       if(i == arr.length - 1) {
        return true;
       }
       
       
    //     if (arr[i] < arr[i + 1]) {
    //        // till now array is sorted
    //        return isSorted(arr, i + 1);
    //    }else{
    //         return false;
    //    }
    if (arr[i] >= arr[i + 1]){
    // array is unsorted 
    return false;
    }
    return isSorted(arr, i + 1);

    }
}
