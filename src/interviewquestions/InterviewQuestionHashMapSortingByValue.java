package interviewquestions;

import java.util.*;

public class InterviewQuestionHashMapSortingByValue {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("sachin", 2);
        map.put("dravid", 5);
        map.put("ganguly", 3);
        map.put("dhoni", 9);
        map.put("pant", 8);
        map.put("ashwin", 7);

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            hm.put(entry.getKey(), entry.getValue());
        }

        hm.forEach((k, v) -> System.out.println("Key = " + k +
                    " Value = " + v));
//        // Create a list from elements of HashMap
//        List<Map.Entry<String, Integer> > list =
//                new LinkedList<Map.Entry<String, Integer> >(map.entrySet());
//
//        // Sort the list
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
//            public int compare(Map.Entry<String, Integer> o1,
//                               Map.Entry<String, Integer> o2)
//            {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//
//        // put data from sorted list to hashmap
//        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
//        for (Map.Entry<String, Integer> aa : list) {
//            temp.put(aa.getKey(), aa.getValue());
//        }
//        for (Map.Entry<String, Integer> en : temp.entrySet()) {
//            System.out.println("Key = " + en.getKey() +
//                    ", Value = " + en.getValue());
//        }
//        Collections.sort(map, new Comparator(map.entrySet()) {
//            @Override
//            public int compare(Object o1, Object o2) {
////                return o1.value > o2.value;
//                return 1;
//            }
//        });


    }

}
