package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Tom", 20),
                new Customer("Steve", 23),
                new Customer("Peter", 27),
                new Customer("Simon", 33));

        String name = customers.stream()
                        .filter(x -> "Peter".equals(x.getName()))
                        .map(Customer::getName)
                        .findAny()
                        .orElse(null);

        System.out.println(name);

        List<String> custList =  customers.stream()
                                   .map(Customer::getName)
                                   .collect(Collectors.toList());

        System.out.println("custList = " + custList);

        custList.forEach(System.out::println);
    }
}
