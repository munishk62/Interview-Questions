package interviewquestions;

import java.util.*;

public class PrintCharsInDescendingOrderOfFrequency {
    public static void main(String[] args) {
        String str = "Bannana";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<Character, Integer> entry : list) {
            System.out.println("Frequency of Occurence of " + entry.getKey() + "Value =" +  + entry.getValue());
        }
    }
}
