package recursion.stringOnRecursion;
import java.util.*;
public class PrintPatternify {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans[] = printPatt(n);
        for(int i=0;i<n;i++) {
            System.out.println(ans[i]);
        }
    }
     static String[] printPatt(int N) {
        
     String[] star = new String[N];
    for (int i = N; i > 0; i--) {
        StringBuilder row = new StringBuilder();
        for (int j = 0; j < i; j++) {
            row.append("*");
        }
        star[N - i] = row.toString();
    }
    return star;
    }
}
