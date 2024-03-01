package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {

        ForkJoinPool corePools = ForkJoinPool.commonPool();

        System.out.println(corePools.getParallelism());

        //1. Parallel() method on stream:

        Stream stream = Stream.of("Naveen", "Munish", "Rakesh", "Salvin", "Peter");

        Stream.of("Naveen", "Munish", "Rakesh", "Salvin", "Peter").forEach(System.out::println);

        System.out.println("--------------");

        Stream.of("Naveen", "Munish", "Rakesh", "Salvin", "Peter").parallel().forEach(System.out::println);

        System.out.println("--------------");


        //2. Use parallelStream() method on collection stream

        Arrays.asList("Naveen", "Munish", "Rakesh", "Salvin", "Peter").parallelStream().forEach(System.out::println);

        // 1 to 10

        System.out.println("----Normal Stream-----");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
        System.out.println("----Parallel Stream-----");
        IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);

        // ----- To print from  a to z ---> 97 --- 122; --------

        System.out.println(getAlphatestList());
    }

    private static List<String> getAlphatestList() {

        List<String> alpha = new ArrayList<String>();

        int n = 97;

        while( n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }
        return alpha;
    }
}
