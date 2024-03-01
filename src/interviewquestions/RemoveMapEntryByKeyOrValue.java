package interviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveMapEntryByKeyOrValue {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String>
                map = new HashMap<>();

        // Populate the HashMap
        map.put(1, "Geeks");
        map.put(2, "ForGeeks");
        map.put(3, "GeeksForGeeks");

        // Get the value to be removed
        String valueToBeRemoved = "ForGeeks";

        String valueToBeRemoved1 = "Geeks";

        // Print the initial HashMap
        System.out.println("Original HashMap: "
                + map);

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if(valueToBeRemoved.equals(iterator.next().getValue())) {
                iterator.remove();
            }
        }
        // Print the modified HashMap
        System.out.println("Modified HashMap: "
                + map);





        // Remove the specified entry from the Map
        map.entrySet()
                .removeIf(
                        entry -> (valueToBeRemoved1.equals(entry.getValue())));

        // Print the modified HashMap
        System.out.println("Modified HashMap: "
                + map);



    }
}
