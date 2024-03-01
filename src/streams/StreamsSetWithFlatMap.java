 package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSetWithFlatMap {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Naveen");
        emp1.addDevices("iPhone8");
        emp1.addDevices("Neo 6");
        emp1.addDevices("Samsung Galaxy");
        emp1.addDevices("Google Pixel 6");

        Employee emp2 = new Employee();
        emp2.setName("Shivam");
        emp2.addDevices("iPhoneX");
        emp2.addDevices("OnePlus 8");
        emp2.addDevices("Motorola");
        emp2.addDevices("Google Pixel 7");

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(emp1);
        empList.add(emp2);

        List<String> devicesList =  empList.stream()
                .map(x -> x.getDevices())
                .flatMap(x -> x.stream())
                .distinct()
                .collect(Collectors.toList());

        devicesList.forEach(x -> System.out.println(x));
    }
}
