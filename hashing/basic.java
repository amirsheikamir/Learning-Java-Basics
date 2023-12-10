package hashing;

import java.util.HashMap;

import ArrayList.input;

public class basic {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        // why two Integer -> key value pair data-type and data-type of value

        hm.put(1, 1616); // put is used to key value pair into hashmap
        hm.put(1, 161);
        hm.put(2, 1617); // it always get most recent one if we getting a duplicate key
        System.out.println(hm.get(1)); //
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));

        //
        if (hm.containsKey(1)) {
            System.out.println("Yes key is present");
        } else {
            System.out.println("Key Not Present");
        }

        // to find out the size in hashmap

        System.out.println("Size of HashMap " + hm.size()); // size shows 2 because duplicates are not allowed.

        // containsValue : it checks the value is present or not in hashmap

        if (hm.containsValue(1617)) {
            System.out.println("Yes");
        }

    }
}
