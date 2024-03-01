package interviewquestions;

import com.sun.jdi.Value;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CoforgeTest {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4};
        int temp[] = new int[4];
        int pos = 0;

        //Approach 1

        for(int i = numbers.length-1; i >= 0; i--) {
            int currNum = numbers[i];
            if(currNum % 2 == 0) {
                temp[pos] = currNum;
                pos++;
            }
        }

        for(int i = numbers.length-1; i >= 0; i--) {
            int currNum = numbers[i];
            if(currNum % 2 != 0) {
                temp[pos] = currNum;
                pos++;
            }
        }
        for(int p = 0; p < temp.length; p++) {
            System.out.println(temp[p]);
        }

       // Approach 2


        Integer[] intArr = { 1, 2, 3, 4 };
        Integer[] outputArray = {};
        List<Integer> arrList = new ArrayList<>(Arrays.asList(intArr));
        Collections.sort(arrList, Collections.reverseOrder());
        List<Integer> output = arrList.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
        output.addAll(arrList.stream().filter(e -> e%2 != 0).collect(Collectors.toList()));
//        System.out.println(output);


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Gill", 23);
        map.put("Rohit", 32);
        map.put("Kohli", 33);
        map.put("Ishan", 26);

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry.getKey());
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // map.forEach((key, val) -> list.add(Map.));
        sortedMap.forEach((key, val) -> System.out.print(key + " " + val));

//        System.out.println(isAnagram("Mother in Law", "Hitler Woman"));

//        System.out.println(factorial(5));
//          generateFibonaci();
//
    }

    private static int factorial(int number) {
      // Approach 1
//        int fact = 1;
//        for(int i = 2; i <= number; i++) {
//            fact = fact*i;
//        };
//        return fact;

        // Approach 1

        if(number == 0){
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }

    private static void generateFibonaci() {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1+",");
        System.out.print(n2+",");
        for(int i = 1; i <= 15; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+",");
        }

    }

    public static boolean isAnagram(String s1, String s2) {
        boolean isAnagram = false;
        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(Arrays.equals(charArray1, charArray2)) {
            isAnagram = true;
        } else {
            isAnagram = false;
        }
        return isAnagram;
    }
}
