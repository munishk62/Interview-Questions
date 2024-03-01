package interviewquestions;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class BMCTest {
    public static void main(String[] args) {
        String str = "Nayar";
        //int strLength = name.();
        //a:2
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //System.out.println(map.entrySet().stream().findFirst());
        int k = 0;
         for(Map.Entry<Character, Integer> entry : map.entrySet()) {
             if(k == 0) {
                 System.out.println(entry.getKey());
                 System.out.println(entry.getValue());
             }
             k++;
         }
    }
}

