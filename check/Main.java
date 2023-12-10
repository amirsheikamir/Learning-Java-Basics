package check;

import java.util.*;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            temp.add(arr.get((i + k) % n));
        }

        return temp;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Scanner for input
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        ArrayList<Integer> originalArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            originalArray.add(scanner.nextInt());
        }

        int k = scanner.nextInt();

        // Rotate the array
        ArrayList<Integer> rotatedArray = Solution.rotateArray(originalArray, k);

        // Display the rotated array
        System.out.println(rotatedArray);

        // Close the scanner
        scanner.close();
    }
}
