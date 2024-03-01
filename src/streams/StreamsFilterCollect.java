package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

    public static void main(String[] args) {
        List<String> prodList = Arrays.asList("MacBook", "iPhone", "Shoes", "Battery Charger", "Bat");
        System.out.println(prodList);
        prodList.forEach(elem -> System.out.println(elem));

        List<String> filteredList = prodList.stream().filter(el -> !"Shoes".equals(el)).collect(Collectors.toList());
        System.out.println("filteredList"+filteredList);

    }
}
