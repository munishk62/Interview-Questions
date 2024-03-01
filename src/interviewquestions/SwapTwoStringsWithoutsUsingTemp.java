package interviewquestions;

import java.util.HashSet;
import java.util.Set;
class SwapTwoStringsWithoutsUsingTemp {
    public static void main(String[] args) {
        String str1 = "Cloud";
        String str2 = "Tech";

        System.out.println("String1 before swap: " + str1);
        System.out.println("String2 before swap: " + str2);


        str1 = str1 + str2;

        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("String1 after swap: " + str1);
        System.out.println("String2 after swap: " + str2);
    }
}