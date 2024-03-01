package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 87, 2, 43, 1, 8, 11, 9, 66);
        List<Integer> evenList = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("List of even numbers = " + evenList);
    }
}
