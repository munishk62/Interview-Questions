package interviewquestions;

import java.util.HashSet;
import java.util.Set;


class Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over lazy dog";
        System.out.println(isPanagram(s.toLowerCase()));
    }

    private static boolean isPanagram(String str) {
        if(str.length() < 26) {
            return false;
        }

        for(char ch = 'a'; ch < 'z'; ch++) {
            if(str.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
}