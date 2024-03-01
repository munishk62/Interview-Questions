package interviewquestions;

public class ExtractNumberFromString {
    public static void main(String[] args) {
        String str = "test1234";
        String resultString = extractNumberFromString(str);
        System.out.println("resultString="+resultString);
    }

    private static String extractNumberFromString(String str) {
        String  extractedStr = "";
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(str == null || str.length() < 1 ) {
                System.out.println("Please enter valid string");
            }
            if(Character.isDigit(c)) {
                extractedStr = extractedStr + c;
            }

        }
       // System.out.println("extractedStr="+extractedStr);
        return extractedStr;
    }
}
