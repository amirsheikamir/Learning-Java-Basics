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
	int a = sc.nextInt();
	int b = sc.nextInt();
	// this line handles column
        for (int i =1; i<=a;i++){
            // responsible for 
            for (int j=1;j<=b;j++){
                if (i == 1 || j == 1 || i == a || j == b){
                System.out.print("*");
             }else {
                System.out.print(" ");
            }}
            System.out.println();
        }	
	
 }
	}	
	


