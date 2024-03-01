package interviewquestions;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        System.out.println("Give number is Prime number = " + isPrime(119));
    }

    static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            System.out.println("Number"+number);
            System.out.println("I"+i);
            if (number % i == 0)  {
                System.out.println("Number divisible by " + i);
                isPrime = false;
                break;
            }else {
                isPrime = true;
            }

        }
        return isPrime;
    }
}