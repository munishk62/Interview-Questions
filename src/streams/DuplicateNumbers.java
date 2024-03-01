package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 5, 287, 2, 23, 23, 8, 5, 9, 266);
        Set<Integer> dupNumbers = numbers.stream()
                                         .filter(e -> Collections.frequency(numbers, e) > 1)
                                         .collect(Collectors.toSet());
        System.out.println("Duplicate Numbers = " + dupNumbers);
    }
}
