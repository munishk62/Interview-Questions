package streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterFindAnyOrElse {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Tom", 20),
                new Customer("Katty", 23),
                new Customer("Hazel", 27),
                new Customer("Rahul", 33));

        Customer customer = customers.stream()
                .filter(x -> "Katty".equals(x.getName())) // Filter with katty
                .findAny() // If it finds then return
                .orElse(null); //

        System.out.println(customer.getName() + "  " + customer.getAge());
    }
}
