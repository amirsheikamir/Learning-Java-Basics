import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
    int fabonacciSeries = sc.nextInt ();


    int firstTerm = 0;
    int secondTerm = 1;

      System.out.print ("Fibonacci sequence up to " + fabonacciSeries +
			" terms: ");
    int count = 0;
    while (count <= fabonacciSeries)
      {
	// i need to find a way gives a sum of all other number 

	if (count <=1)
	  {
	    System.out.print (count + ", ");
	  }
	else
	  {
	    int nextTerm = firstTerm + secondTerm;
	    System.out.print (nextTerm + ", ");
	    firstTerm = secondTerm;
	    secondTerm = nextTerm;

	  }
	count++;


      }
    sc.close ();



  }
}
