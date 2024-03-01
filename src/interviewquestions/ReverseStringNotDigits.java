package interviewquestions;

public class ReverseStringNotDigits {
    public static void main(String[] args) {
        String inputStr = "c23ofor@2ge";
        char[] inputArray = inputStr.toCharArray();
        //e23grof@2oc
        String outputStr = "";
       // int i = 0;
      //  int j = inputArray.length - 1;
//        StringBuilder sb = new StringBuilder(inputStr);
//        for (int i = 0, j = inputStr.length() - 1; i < j;) {
//            if (!Character.isLetter(sb.charAt(i))) {
//                ++i;
//            } else if (!Character.isLetter(sb.charAt(j))) {
//                --j;
//            } else {
//                sb.setCharAt(i, inputStr.charAt(j));
//                sb.setCharAt(j--, inputStr.charAt(i++));
//            }
//        }
//        System.out.println(sb.toString());

        int j = inputArray.length - 1;
        for(int i = 0; i < j;) {
            if(!Character.isAlphabetic(inputArray[i])) {
                i++;
            } else if(!Character.isAlphabetic(inputArray[j])) {
                j--;
            } else {
                char temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(inputArray);
    }
}
