package interviewquestions;

import java.util.HashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "sandeep";
        System.out.print(removeDuplicates(str));
    }

    private static String  removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuffer sf = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(!set.contains(c)) {
                set.add(c);
                sf.append(c);
            }
        }
        return sf.toString();
    }
}
