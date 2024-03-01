package interviewquestions;

import java.util.Arrays;

public class RelTest {
    public static void main(String[] args) {
//        int sum = 0;
//        int[][] array = {{1, 2, 3}, {4, 5, 6}};
//            for(int i = 0; i < 2; i++) {
//                for(int j = 0; j < 3; j++) {
//                    sum = sum + array[i][j];
//                }
//            }
//
//            System.out.println("Sum = " + sum);


        String one = "abcdef";
        String two = "pqrs";
        String remaining = "";
        String concattinatgedStr = "";
        String output = "";
        remaining = one.substring(two.length());
        for (int i = 0; i < two.length(); i++) {
            char firstStrChar = one.charAt(i);
            char secondStrChar = two.charAt(i);
            concattinatgedStr = concattinatgedStr + String.valueOf(firstStrChar + "" + secondStrChar);
        }
        output = concattinatgedStr + remaining;
        System.out.print(output);
    }
}