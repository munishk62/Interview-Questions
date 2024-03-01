package interviewquestions;

public class CheckIfStringIsNumeric {
    public static void main(String[] args) {
          System.out.println(isStringNumeric("74863"));
    }

    public static boolean isEmpty(String str) {
        boolean isEmpty = false;
        if(str == null || str.length() < 1) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public static boolean isStringNumeric(String str) {
        boolean isStringNumeric = true;

        if(isEmpty(str)) {
            isStringNumeric = false;
        }

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!Character.isDigit(c)) {
                isStringNumeric = false;
            }
        }

        return isStringNumeric;
    }

}
