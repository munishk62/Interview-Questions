package interviewquestions;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Virender", 35);
        map.put("Sachin", 36);
        map.put("Rahul", 38);
        map.put("Virat", 32);
        map.put("Rohit", 31);
        map.put("Yuvraj", 33);
        map.put("Ishan", 30);

        // print the sorted hashmap using comparator
        Map<String, Integer> sortedMap = sortMapByValueUsingComparator(map);
        System.out.println("Print Values Using Comparator");
        for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

        // print the sorted hashmap using Lambda
        System.out.println("Print Values Using Lambda");
        Map<String, Integer> sortedMap1 = sortMapByValueUsingComparator(map);

        for (Map.Entry<String, Integer> en : sortedMap1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }


        // print the sorted hashmap using Streams
        System.out.println("Print Values Using Streams");
        Map<String, Integer> sortedMap2 = sortMapByValueUsingStream(map);

        for (Map.Entry<String, Integer> en : sortedMap2.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }

    private static Map<String, Integer> sortMapByValueUsingComparator(HashMap<String, Integer> map) {

        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }


    private static Map<String, Integer> sortMapByValueUsingLambda(HashMap<String, Integer> map) {

        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        // Sort the list
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }


    private static Map<String, Integer> sortMapByValueUsingStream(HashMap<String, Integer> map) {

        // put data from sorted list to hashmap
        HashMap<String, Integer> sortedMap = map.entrySet()
                                                  .stream()
                                                  .sorted((l1, l2) -> l1.getValue().compareTo(l2.getValue()))
                                                  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortedMap;
    }

}
