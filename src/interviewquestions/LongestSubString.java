package interviewquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcdab";
        Longest(str);
    }

    private static void Longest(String str) {
        HashSet<Character> set = new HashSet<>();
        String longestTillNow = "";
        String longestOverAll = "";

        for(int i =0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(set.contains(c)) {
                longestTillNow = "";
                set.clear();
            }
            set.add(c);
            longestTillNow = longestTillNow + c;
            if(longestTillNow.length() > longestOverAll.length()) {
                longestOverAll = longestTillNow;
            }
        }
        System.out.println("longestOverAll = " + longestOverAll);
    }
}
