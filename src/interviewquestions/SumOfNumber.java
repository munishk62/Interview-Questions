package interviewquestions;

class SumOfNumber {
    public static void main(String[] args) {
        int number = 1234;

        int sum = 0;
        while(number != 0) {
            int reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        System.out.println("Sum Of Number = " + sum);
    }
}