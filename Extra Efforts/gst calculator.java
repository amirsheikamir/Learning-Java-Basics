/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
		// 18 % gst 
    if ( n < 5000  )
			System.out.println( n * 18 / 100 );
			else if ( n < 10000 )
			System.out.println( n * 20 /100 );
			else if ( n < 20000 )
				System.out.println( n * 25 /100 );
		else if ( n > 21000 )
				System.out.println( n * 28 /100 );
				// System.out.printf("%.2f", val);
	
}
}