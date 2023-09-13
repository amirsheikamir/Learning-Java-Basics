import java.util.*;
public class checkOdd {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean result =  solve(n);
        if(result == true) {
            System.out.println("Yes Odd Number");
        }else{
            System.out.println("Not odd");
        }
    }

     static boolean solve(int n) {
       
        int check = n / 2;
        if (check * 2 == n) {
            return true;
        }else
        return false;
    }
}
