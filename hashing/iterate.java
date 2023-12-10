package hashing;

import java.util.HashMap;

public class iterate {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 13); 
        hm.put(2, 161);
        hm.put(3, 1851);

        // KeySet Iterates all overt the key
        for (int i : hm.keySet()) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        // Values // Iterate over Values 
        for (int j : hm.values()) {
            System.out.print(j+" ");
        }
System.out.println();

        // remove to remove keys 

        hm.remove(2);
         for (int j : hm.values()) {
            System.out.print(j+" ");  // remove key 2;
        }

        System.out.println();


// get or default means if value present you get value if not you will get default.
        hm.put(1, hm.getOrDefault(hm, 0));
    }
}
