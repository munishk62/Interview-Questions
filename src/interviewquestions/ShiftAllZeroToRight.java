package interviewquestions;

public class ShiftAllZeroToRight {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 4, 2, 0,9};
        int[] shiftedArray = shiftZeroToRight(array);
        for(int k = 0; k < shiftedArray.length; k++) {
            System.out.println(shiftedArray[k]);
        }
    }

    private static int[] shiftZeroToRight(int[] array) {
        if(array.length == 1 ) {
            return array;
        }
        int[] newArray = new int[array.length];
        int index = 0;
        for(int number : array) {
            if(number != 0) {
                newArray[index] = number;
                index++;
            }
        }
        return newArray;
    }
}
