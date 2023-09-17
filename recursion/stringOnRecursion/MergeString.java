package recursion.stringOnRecursion;

import java.util.*;
public class MergeString {

    public static String mergeStrings(String a, String b) {
        return solve(a, b,0);
    }
	static String solve(String a, String b, int i) {
		   if (i == a.length() || i == b.length()) {
             return " ";
             }
    
    StringBuilder result = new StringBuilder();
     if (i < a.length()) {
        result.append(a.charAt(i));
    }
     if (i < b.length()) {
        result.append(b.charAt(i));
    }
    result.append(solve(a, b, i + 1));
    
    return result.toString();
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String result = mergeStrings(a, b);
        System.out.println(result);
    }
}