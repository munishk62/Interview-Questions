package interviewquestions;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class PrintFrequency {
    public static void main(String[] args) {
        String[] array = {"banana", "apple", "grapes", "mango", "apple", "orange", "banana"};
        ArrayList<String> list = new ArrayList(Arrays.asList(array));
        System.out.println(list);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            Integer value = map.get(name);
            if(value != null) {
                map.put(name, value+1);
            } else {
                map.put(name, 1);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        System.out.println("Map = " + set);


//        String s = "Banana";
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            Character c = s.charAt(i);
//            Integer value = map.get(c);
//            if(value != null) {
//                map.put(c, value+1);
//            } else {
//                map.put(c, 1);
//            }
//        }
//        Set<Map.Entry<Character, Integer>> set = map.entrySet();
//        System.out.println("Map = " + set);
    }
}
