package interviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IfKeyExistInMap {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String>
                map = new HashMap<>();

        // Populate the HashMap
        map.put(1, "Geeks");
        map.put(2, "ForGeeks");
        map.put(null, "GeeksForGeeks");

        // Get the key to be removed
        int keyToBeChecked = 2;

        // Print the initial HashMap
        System.out.println("HashMap: "
                + map);

        // Check is key exists in the Map
        boolean isKeyPresent = map.containsKey(keyToBeChecked);

        // Print the result
        System.out.println("Does key "
                + keyToBeChecked
                + " exists: "
                + isKeyPresent);



        try {
            // Create a HashMap
            HashMap<Integer, String>
                    map1 = new HashMap<>();

            // Populate the HashMap
            map1.put(1, "Geeks");
            map1.put(2, "ForGeeks");
            map1.put(3, "GeeksForGeeks");

            // Get the key to be removed
            int mapKeyToBeChecked = 2;
        // Print the initial HashMap
        System.out.println("HashMap: "
                + map1);

        // Get the iterator over the HashMap
        Iterator<Map.Entry<Integer, String> >
                iterator = map1.entrySet().iterator();

        // flag to store result
        boolean isMapKeyPresent = false;

        // Iterate over the HashMap
        while (iterator.hasNext()) {

            // Get the entry at this iteration
            Map.Entry<Integer, String>
                    entry
                    = iterator.next();

            // Check if this key is the required key
            if (mapKeyToBeChecked == entry.getKey()) {

                isMapKeyPresent = true;
            }
        }

        // Print the result
        System.out.println("Does key "
                + mapKeyToBeChecked
                + " exists: "
                + isMapKeyPresent);
    }
        catch (Exception e) {
        System.out.println(e);
    }






    }
}
