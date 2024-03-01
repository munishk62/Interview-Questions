package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        // Approach 1 arraycopy() function

        int[] firstArray = {23,45,12,78,4,90,1};        //source array
        int[] secondArray = {77,11,45,88,32,56,3};  //destination array
      //  mergeArrayUsingArrayCopy(firstArray , secondArray);

        // Approach 2 Iteration
//        mergeArraysUsingIteration(firstArray, secondArray);

        // Approach 3 Using List
        String str1[] = { "A", "E", "I" };          //source array
        String str2[] = { "O", "U" };               //destination array
//        mergeArrayUsingList(str1, str2);


        //Approach 4 Using Java Streams

        Integer[] array1 = new Integer[]{13,12,11,6,9,3}; //source array
        Integer[] array2 = new Integer[]{78,34,56,67,2,11,7}; //destination array
        Object[] mergedArray = mergeArraysUsingStream(array1,array2); //merged array
        System.out.println("Merged array: "+ Arrays.toString(mergedArray));System.out.println("Merged array: "+ Arrays.toString(mergedArray));

    }

    private static void mergeArrayUsingArrayCopy(int[] firstArray, int[] secondArray) {
        int fal = firstArray.length;        //determines length of firstArray
        int sal = secondArray.length;   //determines length of secondArray
        int[] result = new int[fal + sal];  //resultant array of size first array and second array
        System.arraycopy(firstArray, 0, result, 0, fal);
        System.arraycopy(secondArray, 0, result, fal, sal);
        System.out.println(Arrays.toString(result));    //prints the resultant array
    }

    private static void mergeArraysUsingIteration(int[] firstArray, int[] secondArray) {
        int fal = firstArray.length;        //determines length of firstArray
        int sal = secondArray.length;   //determines length of secondArray
        int length = fal + sal; //add the length of firstArray into secondArray
        int[] mergedArray = new int[length];    //resultant array
        int pos = 0;
        for (int element : firstArray) //copying elements of secondArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;              //increases position by 1
        }
        for (int element : secondArray) //copying elements of firstArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(mergedArray));   //prints the resultant array
    }

    private static void mergeArrayUsingList(String[] firstArray, String[] secondArray) {
        List list = new ArrayList(Arrays.asList(firstArray)); //returns a list view of an array
        //returns a list view of str2 and adds all elements of str2 into list
        list.addAll(Arrays.asList(secondArray));
        Object[] str3 = list.toArray();         //converting list to array
        for(int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        };
    }


    private static Object[]  mergeArraysUsingStream(Integer[] firstArray, Integer[] secondArray) {
        return Stream.of(firstArray, secondArray).flatMap(Stream::of).toArray();
    }


}
