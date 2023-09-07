import java.util.Scanner;
public class Main 
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int avg = (a+b+c)/3;

		System.out.println(avg);
	}
}