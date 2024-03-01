package interviewquestions;

import java.util.Scanner;

class StringRecursionDemo {
    public static void main(String[] args) {
          String str = "Taanshu";
          System.out.println(recursiveString(str));
    }

    private static String recursiveString(String s) {

        if(s == null || s.length() <= 1) {
            return s;
        }
        return recursiveString(s.substring(1))+s.charAt(0);
    }
}