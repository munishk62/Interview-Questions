package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {
        
    public static void main(String[] args) {
        //System.out.println(isPrime(7));
        long count = Stream.iterate(0, n -> n+1)
                .limit(50)
                .filter(PrimeNumberWithParallelStream::isPrime)
                .peek(x -> System.out.println(x))
                .count();
        System.out.println("total prime numbers" + count);
    }

    private static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x == 0);
    }
}
