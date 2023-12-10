package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class basicProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
       } 

       HashMap<Integer, Integer> hm = new HashMap<>();
       for (int i = 0; i < n; i++) {
        hm.put(arr[i], hm.getOrDefault(arr[i], 0)+ 1);
        
       }
        

       for (int i : hm.keySet()) {
            System.out.print(i+" " + hm.get(i)+" ");
            System.out.println();
       }
    }
}
