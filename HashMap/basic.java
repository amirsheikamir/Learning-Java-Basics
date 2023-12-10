package HashMap;

import java.util.*;
public class basic {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insertion Operation.

        hm.put("India", 120);
        hm.put("US", 30);
        hm.put("Russia", 150);
        hm.put("China", 180);

        // deletion operation 
        hm.remove("US");   
        // System.out.println(hm);

        //  Searching Operation or look up 
        if (hm.containsKey("India")) {
            System.out.println("Found : " + hm.get("India") );
        }else{
            System.out.println("Not Found");
        }



        //  how to iterate over a HashMap 
                                        // name of map 
        for(Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }
    }
}
