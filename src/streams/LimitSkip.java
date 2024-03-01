package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 5, 287, 2, 43, 21, 8, 11, 9, 266);

        List<Integer> firstFive = list.stream().limit(5).collect(Collectors.toList());
        System.out.println("Limit Five = " + firstFive);

        int suml = list.stream().limit(5).reduce((p, q) -> p + q).get();

        System.out.println("Sum = " + suml);

        List<Integer> skipFive = list.stream().skip(5).collect(Collectors.toList());
        System.out.println("Skip Five = " + skipFive);

        int sumk = list.stream().skip(5).reduce((p, q) -> p + q).get();

        System.out.println("Sum = " + sumk);
    }
}
