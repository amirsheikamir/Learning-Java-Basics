import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print("* ");
		}
		System.out.println();
		for(int i = 1; i <= n; i++){
			System.out.println("*");
		}
       
    }
}