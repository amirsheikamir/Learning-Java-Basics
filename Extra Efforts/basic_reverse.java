import java.util.*;
public class Basic_Reverse {
  public static void main(String[] args) {
  
  // import a scnner and define obj ...
  	Scanner sc = new Scanner(System.in);
  	// show ouput for get string...
  	System.out.print("Original string: " );
  	// Define String varibale which store string from input...
    String originalStr = sc.nextLine();
    
    // Scanner close 
    
    sc.close();
    
    // new variable declare for store reversed String 
    String reversedStr = "";
    
    /* Logic part here : we use a method called -->  "charAt()" which Index words
    means position of word  
        */
    for (int i = 0; i < originalStr.length(); i++) {
      reversedStr = originalStr.charAt(i) + reversedStr;
    }
    
    System.out.println("Reversed string: "+ reversedStr);
  }
}

