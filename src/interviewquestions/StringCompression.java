package interviewquestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String str = "Sandeep";
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println("Compressed String = " + sb);
    }
}
