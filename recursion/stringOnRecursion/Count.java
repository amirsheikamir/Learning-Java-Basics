package recursion.stringOnRecursion;
import java.util.*;

public class Count {
// Q find the char abc and aba in string if yes then count not char as string count
public class Main {
    static int CountABC(String str, int i) {
        // base case
		if (i > str.length() -3)
			return 0;
		// curr condition.. 
     int cnt = 0;
		if ((str.substring(i, i +3).equals("abc"))|| (str.substring(i, i +3).equals("aba"))) {
			cnt++;
		}
        int remcnt = CountABC(str, i + 1);

		return cnt + remcnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s, 0));

    }
}
    }
