import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
       Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ( a == 1){
			System.out.println(31);
		}

			else if (a == 3){
			System.out.println ("31");
			}
		else if (a == 4){
			System.out.println ("30");
			}
		else if (a == 5){
			System.out.println ("31");
			}
		else if (a == 6){
			System.out.println ("30");
			}
		else if (a == 7){
			System.out.println ("31");
			}
		else if (a == 8){
			System.out.println ("31");
			}
		else if (a == 9){
			System.out.println ("30");
			}
		else if (a == 10){
			System.out.println ("31");
			}
		else if (a == 11){
			System.out.println ("30");
			}
		else if (a == 12){
			System.out.println ("31");
			}
		else if  ((b % 400 == 0) || ((b % 4 == 0) && (b % 100 != 0))) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
		
		}
    }
