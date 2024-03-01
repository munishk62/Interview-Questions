package interviewquestions;

import streams.PrimeNumberWithParallelStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberDemoUsingStream {
    public static void main(String[] args) {
        Long count = Stream
                .iterate(0, n -> n+1)
                .limit(50)
                .filter(PrimeNumberDemoUsingStream::isPrime)
                .peek(x -> System.out.println(x))
                .count();
        System.out.println("Total number of prime numbers = "+ count);
    }

    static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number % x == 0);
    }

}
