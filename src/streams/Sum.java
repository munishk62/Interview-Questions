package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 87, 2, 43, 1, 8);
        Optional sum = list.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of Numbers = " + sum.get());
    }
}
