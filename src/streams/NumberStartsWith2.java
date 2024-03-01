package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 5, 287, 2, 43, 21, 8, 11, 9, 266);
        List<Integer> numbersWith2List = numbers.stream()
                                                 .map(e -> String.valueOf(e))
                                                 .filter(e -> e.startsWith("2"))
                                                 .map(Integer::valueOf)
                                                 .collect(Collectors.toList());
        System.out.println("List of Numbers Starting with 2 = " + numbersWith2List);
    }
}
