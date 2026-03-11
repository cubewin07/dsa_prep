package hashmaps.syntax;

import java.util.HashMap;
import java.util.Map;

public class hashMap_syntax {
    public static void main(String[] args) {
        // Init
        HashMap<String, Integer> map =new HashMap<>();

        // Put
        map.put("apple", 2);
        map.put("banana", 5);

        // get
        map.get("apple");

        // Key contain
        map.containsKey("banana");

        // Remove - O(1)
        map.remove("apple");

        // Set new value 
            // key exist
                map.replace("banana", 4);
            // key non-exist
                map.put("apple", map.get("apple") + 1);



        // Average - O(1) + worst case - O(n)

        

        // Iterate

            // Key only
                for(String key : map.keySet()){
                    System.out.println(key);
                }
            // Both key and value
                for(Map.Entry<String, Integer> entry : map.entrySet()){
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
    }
}
