package interviewquestions;

public class FactorialNumber {
    public static void main(String[] args) {
        //findFactorialNonRecursive(7);

       System.out.println("Factorial Using Recursion = " + findFactorialRecursive(7));
    }

    private static void findFactorialNonRecursive(int num) {
        int factorial = 1;
        for(int i = num; i > 0; i--) {
            factorial = factorial * i;
            System.out.println("Factorial = " + factorial);
        }
        System.out.println("Factorial Final = " + factorial);
    }

    private static int findFactorialRecursive(int num) {

            return num * findFactorialRecursive(num-1);

    }

}
