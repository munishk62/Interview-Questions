package interviewquestions;

class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;

        // Approach 1 String Reverse

        /*
        int reverse;
        StringBuilder str = new StringBuilder(String.valueOf(number));
        reverse = Integer.valueOf(str.reverse().toString());

        System.out.println("Reverse String is "+ reverse);
        */

        // Approach 2

        int reverse = 0;
        while(number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println("Reverse Number = " + reverse);
    }
}