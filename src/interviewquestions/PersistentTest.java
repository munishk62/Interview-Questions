package interviewquestions;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PersistentTest {
    private static int n1 = 0;
    private static int n2 = 1;

    private static int n3;

    public static void main(String[] args) {
        int[] firstArray = {23,45,12,78,4,90,1};        //source array
        int[] secondArray = {77,11,45,88,32,56,3};  //destination array

        int fal = firstArray.length + secondArray.length;

        int[] finalArray = new int[fal];

        System.arraycopy(firstArray, 0, finalArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, finalArray, firstArray.length, secondArray.length);

        for(int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i]+",");
        }
    }


    private static void generateFibonnaciRecursively(int count) {
        if(count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", " + n3);
            generateFibonnaciRecursively(count - 1);
        }

    }

}
