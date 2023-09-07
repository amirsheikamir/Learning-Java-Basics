import java.util.*;

public class Reverse {
    public static void main(String args[]){

        // first i get a scanner for input

        Scanner revert = new Scanner(System.in);
        // now i want to show put string in it i use println()
        System.out.println("Enter sentence for reverse : ");
        
        // now i declare varaible for string to store;
        String OriginalString = revert.nextLine();
        // here i close the scanner for string
        revert.close();

        // i have to split each word 

        String words[] = OriginalString.split("\\s");

        // now i need to store split string in new variable.

        String reversedString = "";

    // Reverse Each words Position.

    for (int i = 0; i < words.length; i++) { 
        if (i == words.length -1 )
        reversedString = words[i] + reversedString;
        else
        reversedString = " " + words[i] + reversedString;

    }

    System.out.println("Reversed String : " + reversedString);
       
    }
}