package interviewquestions;

public class Palindrome {
    public static void main(String[] args) {
        String str = "dad";
        System.out.println("isPalindrome(str)="+isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        boolean isPalindrome = true;
        int i = 0; int j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}
