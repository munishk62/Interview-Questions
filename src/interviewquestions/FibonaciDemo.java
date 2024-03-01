package interviewquestions;

import java.util.Scanner;

public class FibonaciDemo {
    public static void main(String[] args) {

        generateFibonaci(1);
    }

    private static void generateFibonaci(int numbberSeries) {
        int n1 =0;
        int n2 =1;
        int n3;
        int count = 10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        for (int i =2; i < 10; i++) {
            n3 = n1 + n2;

            System.out.print("" + n3 + " ");

            n1 = n2;
            n2 = n3;
        }

    }
}
