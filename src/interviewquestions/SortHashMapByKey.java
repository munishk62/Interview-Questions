package interviewquestions;

import java.util.*;

public class SortHashMapByKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Virender", 35);
        map.put("Sachin", 36);
        map.put("Rahul", 38);
        map.put("Virat", 32);
        map.put("Rohit", 31);
        map.put("Yuvraj", 33);
        map.put("Ishan", 30);

        // print the sorted hashmap using TreeMap
        Map<String, Integer> sortedMap = sortMapByKeyUsingTreeMap(map);
        System.out.println("Print Values Using TreeMap");
        for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

        // print the sorted hashmap using Lambda
        Map<String, Integer> sortedMap1 = sortByKeyUsingLambda(map);
        System.out.println("Print Values Using Lambda");
        for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }


    }

    private static Map<String, Integer> sortMapByKeyUsingTreeMap(HashMap<String, Integer> map) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.putAll(map);
        return sortedMap;
    }

    // function to sort hashmap by keys
    public static Map<String, Integer> sortByKeyUsingLambda(Map<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list
                = new LinkedList<Map.Entry<String, Integer> >(
                hm.entrySet());

        // Sort the list using lambda expression
        Collections.sort(
                list,
                (i1, i2) -> i1.getKey().compareTo(i2.getKey()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp
                = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
