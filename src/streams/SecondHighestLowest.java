package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLowest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 5, 287, 2, 43, 21, 8, 11, 9, 266);

        int secH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println("Second Highest = " + secH);

        int secHh = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second Highest = " + secHh);

        int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second Lowest = " + secL);
    }
}
