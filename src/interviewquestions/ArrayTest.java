package interviewquestions;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numberArray = {3,4,5,6,8,1};
//        int last =  numberArray[numberArray.length - 1];
//        for(int j = numberArray.length - 1; j > 0; j--) {
//            numberArray[j] = numberArray[j-1];
//        }
//        numberArray[0] = last;


        for(int i = 0, j = numberArray.length-1; i < numberArray.length;) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[j];
            numberArray[j] = temp;
            i++;
        }


        for(int k = 0; k < numberArray.length; k++) {
            System.out.println(numberArray[k]);
        };
    }
}
