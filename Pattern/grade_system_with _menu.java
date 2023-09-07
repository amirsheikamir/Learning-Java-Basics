/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("...........Welcome to My Grade System Program........");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	    switch(a){
	        case 0: System.out.println("Byeee..");
	            break;
	            case 1: System.out.println("Welcome...");
	              int i = b;
	              do {
	                  System.out.println(i);
	                  i++;
	              }while (i<=a);
	              if (b >= 90 ){
	                  System.out.println("This is Good. ");
	              }else if (b >= 80){
	                  System.out.println("This is also Good.");
	              }else if (b >= 0){
	                  System.out.println("This is Good as Well.");
	              }
	    }
	
	}
}
