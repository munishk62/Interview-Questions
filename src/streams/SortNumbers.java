package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 5, 287, 2, 43, 21, 8, 11, 9, 266);

        List<Integer> sortedAscList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedList Asc = " + sortedAscList);

        List<Integer> sortedDscList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("sortedList Dsc = " + sortedDscList);
    }
}
