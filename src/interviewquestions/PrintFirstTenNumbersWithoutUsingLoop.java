package interviewquestions;

public class PrintFirstTenNumbersWithoutUsingLoop {
    public static void main(String[] args) {
        recursiveFun(1);
    }

    private static void recursiveFun(int n) {
        if (n <= 10) {
            System.out.println(n);
            recursiveFun(n+1);
        }
    }
}
