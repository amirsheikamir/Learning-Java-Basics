import java.util.*;
public class mergeString {
       public static void main (String[] args) {
           Scanner sc = new Scanner(System.in);
           String a = sc.nextLine();
           String b = sc.nextLine();
           
         String result = mergeStrings(a , b);
         System.out.print(result);
           
       } 
    
    public static String mergeStrings(String a, String b) {
         StringBuilder result = new StringBuilder();
   
         // For every index in the strings
         for (int i = 0; i < a.length() || i < b.length(); i++) {
   
             // First choose the ith character of the
             // first string if it exists
             if (i < a.length())
                 result.append(a.charAt(i));
   
             // Then choose the ith character of the
             // second string if it exists
             if (i < b.length())
                 result.append(b.charAt(i));
         }
   
         return result.toString();
     }
}
