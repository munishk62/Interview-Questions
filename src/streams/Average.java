package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Average {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 87, 2, 43, 1, 8);
        Double average = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average of Numbers = " + average);
    }
}
