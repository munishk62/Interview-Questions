package interviewquestions;

import com.sun.jdi.Value;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharDemo {
    public static void main(String[] args) {
        String str = "aabbddefg";
        char c = getFirstNonRepeatedChar(str);
        System.out.println("Non Repeated Char is " + c);
    }

    private static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
               if(entry.getValue() == 1) {
                   return entry.getKey();
               }
        }

        throw new RuntimeException("Did not find any non repeated characters");
    }
}
