    import java.util.*;

    public class insertionSort {
    
        static void solve(int[] arr, int n ) {
            for (int i = 0; i < n - 1; i++) {
              for(int j = i + 1; j > 0; j--) {
                 if (arr[j] < arr[j - 1]) {
                     
                    swap(arr, j, j - 1);
                 }else {
                     break;
                 }   
            }
        }
            
    
 }
    
      
    
        static void swap (int[] arr, int first, int second) {
    
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
    
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
    
            solve(arr, n);
    
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
     }
    
