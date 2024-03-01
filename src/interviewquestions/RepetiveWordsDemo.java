package interviewquestions;

import java.util.HashMap;

public class RepetiveWordsDemo {
    public static void main(String[] args) {
        String s = "coffee";
        getRepeativeWords(s);

    }


    private static void getRepeativeWords(String str) {
        HashMap<Character, Integer> map1 = new HashMap();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer value = map1.get(c);
            if(value != null) {
                map1.put(c, value+1);
            } else {
                map1.put(c, 1);
            }

        }
       System.out.println("Repeative words map1"+map1);
    }
}
