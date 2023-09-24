import java.util.*;

import check.Solution;

class Solution
{
  static void solve (int a, int b)
  {
    if (a + b == 10 || a == 10 || b == 10)
      {
	System.out.println ("Yes");
      }
    else
      {
	System.out.println ("No");
      }
  }
}

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt ();
    int b = sc.nextInt ();
      Solution.solve (a, b);
  }
}
