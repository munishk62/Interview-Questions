package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 5, 287, 2, 43, 21, 8, 11, 9, 266);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max = " + max);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min = " + min);
    }
}
