import java.util.*;


public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
      sc.close ();
// This code faster then below code and smart way to do it .....

if (n > 90 )
      {
	System.out.println ("Excellent");
      }
else if (n > 80 )
      {
	System.out.println ("Good");
      }
else if (n > 70 )
      {
	System.out.println ("Fair");
      }
else if (n > 60 )
      {
	System.out.println ("Meets Expectations");
      }
else 
      {
 System.out.println ("Below Expectations");
      }}




// ==============================================================
// this code works slow which is below : 


    if (n > 90 )
      {
	System.out.println ("Excellent");
      }
    else if (n > 80 && n < 90)
      {
	System.out.println ("Good");
      }
    else if (n > 70 && n < 80)
      {
	System.out.println ("Fair");
      }
    else if (n > 60 && n < 70)
      {
	System.out.println ("Meets Expectations");
      }
    else  {
		 System.out.println ("Below Expectations");
	}
     

  }
}
