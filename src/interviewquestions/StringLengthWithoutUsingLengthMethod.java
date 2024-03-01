package interviewquestions;

public class StringLengthWithoutUsingLengthMethod {
    public static void main(String[] args) {
        String str = "testing";
        System.out.println(str.toCharArray().length);
        System.out.println(str.lastIndexOf(""));


        long count = str.chars().filter(e -> (char)e == 't').count();
        System.out.println("count="+count);

        String str1 = "aeiou";
        int vCount = 0;

        for(int x = 0; x < str1.length(); x++) {
            if(isVowel(str1.charAt(x))) {
                vCount++;
            }
        }
        System.out.println("vCount = " + vCount);
    }

    private static boolean isVowel(char c) {
        boolean isVowel = false;
         if( c == 'a' || c == 'e' || c == 'i' || c== 'o' || c =='u') {
             isVowel = true;
         }
        return isVowel;
    }
}
