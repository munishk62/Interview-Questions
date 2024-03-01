package comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 32, "Ashish", new Address("Hno 155", 232));
        Employee e2 = new Employee(2, 36, "Munish", new Address("Hno 154", 456));
        Employee e3 = new Employee(3, 34, "Navneet", new Address("Hno 125", 322));
        Employee e4 = new Employee(4, 30, "Kattu", new Address("Hno 135", 982));

        List<Employee> empList = new ArrayList<>();
            empList.add(e1);
            empList.add(e2);
            empList.add(e3);
            empList.add(e4);

        System.out.println("Unsorted empList = "+empList);

        Collections.sort(empList, new NameComparator());

        System.out.println("Sorted empList = "+empList);
    }
}
