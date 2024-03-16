package interviewquestions;

public class BirlaSoftTest {
    public static void main(String[] args) {
        String str = "S879br54@ta#$5";
        extractNumberFromString(str);
    }
    private static String extractNumberFromString(String str){
        String output = "";
        for(int i = 0; i < str. length(); i++) {
            char c = str.charAt(i);
            if(!Character.isDigit(c) && !Character.isAlphabetic(c)) {
                output = output + c;
            }
        }
        System.out.println("output = " + output);
        return output;
    }
}
