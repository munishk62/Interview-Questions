package interviewquestions;

import java.util.Arrays;

public class RemoveElementFromAnArray {
    public static void main(String[] args) {

        //Create Array from which we need to remove element
        int[] originalArray = {2,3,7,6,8,9};

        //Create Variable to hold value that we need to remove
        int elementToRemove = 8;

        int[] newArray = remove(originalArray, elementToRemove);
        System.out.println("Original Array="+ Arrays.toString(originalArray));
        System.out.println("New Array="+ Arrays.toString(newArray));
    }

    private static int[] remove(int[] originalArray, int elementToRemove) {
        int[] newArray = new int[originalArray.length-1];
        int index = 0;
        for(int i =0; i < originalArray.length; i++) {
            if(originalArray[i] != elementToRemove) {
                newArray[index] = originalArray[i];
                index++;
            }
        }
        return newArray;
    }
}
