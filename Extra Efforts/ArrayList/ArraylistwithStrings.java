package ArrayList;
import java.util.*;
import java.util.ArrayList;

public class ArraylistwithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ArrayList<String> store = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            store[i] = sc.nextLine();    
        }
        

        for (int i = 0; i <name.length(); i++) {
            System.out.print(store.get(i)+" ");
        }
    }
}