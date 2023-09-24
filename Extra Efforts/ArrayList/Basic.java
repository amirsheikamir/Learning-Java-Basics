package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(5);
    // for adding elements 
    list.add(10);
    list.add(20);
    list.add(30);
    
        System.out.println(list);

        // for removing Elements.. 
    list.remove(1);
    System.out.println("after remove ");
        System.out.println( (list));
        // check given element is present or not..

        System.out.println(list.contains(10));

        //  set new element in given arrayList 
        list.set(1, 20);
        System.out.println(list);

        // add new element in Arralist 
        list.add(2, 30);
        System.out.println(list);
   } 
}
