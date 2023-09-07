/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	// outer loop 
        for (int i = 1 ; i<=n ; i++){
            // inner loop 
            for (int j=1 ;j<=i; j++){
              int sum = i+j;
              if (sum % 2 ==0 ){
                  System.out.print("1 ");
              }else{
                  System.out.print("0 ");
              }
            }
            System.out.println();
          
	}
}
}
