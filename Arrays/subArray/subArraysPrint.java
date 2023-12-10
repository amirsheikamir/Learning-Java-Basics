package Arrays.subArray;
import java.util.*;
public class subArraysPrint {

    static void printSubArrays(int[] arr) {
    
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
            

                for (int j2 = start; j2 <=end; j2++) {
                    System.out.print(arr[j2]+" ");
                   
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       
        printSubArrays(arr);

    }
}
