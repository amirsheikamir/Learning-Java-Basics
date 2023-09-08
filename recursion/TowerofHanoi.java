package recursion;
import java.util.*;
public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        Hanoi(n, 1, 3, 2);
    }

     static void Hanoi(int n, int from, int to, int aux) {
        if (n == 0)
        return;
        Hanoi(n -1 , from, aux, to);
        System.out.println(" move disk " + n + " from rod " + from + " to rod " + to);
        Hanoi(n - 1, aux, to, from);
    }
}
