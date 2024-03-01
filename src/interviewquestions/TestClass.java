package interviewquestions;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {
    static int n1 = 0;
    static int n2 = 1;
    static int n3;
    public static void main(String[] args) {
//        System.out.println("Please enter number of elements");
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        int[] array = new int[100];
//        System.out.println("Please enter array elements");
//        Scanner elements = new Scanner(System.in);
//        for(int i = 0; i < n; i++) {
//            array[i] = elements.nextInt();
//        }
//
//        System.out.println("Please enter sum");
//        Scanner sumSc = new Scanner(System.in);
//        int sum = Integer.parseInt(sumSc.nextLine());

       // SubArray(array, n, sum);


        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Virender", 35);
        map.put("Sachin", 36);
        map.put("Rahul", 38);
        map.put("Virat", 32);
        map.put("Rohit", 31);
        map.put("Yuvraj", 33);
        map.put("Ishan", 30);

        map.forEach((k, v) -> System.out.println("Key = " + k + ", " + "Value = " + v));

        HashMap<String, Integer> sortedMap = sortHashMapByValue(map);

        System.out.println("Sorted Map Print >>>>>>>");
        
        sortedMap.forEach((k, v) -> System.out.println("Key = " + k + ", " + "Value = " + v));
    }

    private static  HashMap<String, Integer> sortHashMapByValue(HashMap<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        };
        return sortedMap;
    }

    private static int SubArray(int[] arr, int n, int sum) {
        int currentSum;
        for(int i = 0; i < arr.length; i++) {
            currentSum = arr[i];

            for(int j = i + i; j < arr.length; j++) {
                if(currentSum == sum) {
                    int p =j - 1;
                    System.out.println("SubArray found between" + i + "and" + p);
                    return 1;
                }
                if(currentSum > sum || j == n) {
                    break;
                }
                currentSum = currentSum + arr[j];
            }

         }
        System.out.println("No sub array found");
        return 0;
        }
    private static char getFirstNotRepeatedChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char x = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("Did not find any non repeated characters");
    }

    private static boolean isPrime(int number) {
        System.out.println("Number = " + number);
        IntStream.rangeClosed(2, number/2).forEach(e -> System.out.println(">>" + e + " "));
        return !IntStream.rangeClosed(2, number/2).anyMatch(e -> number%e == 0);
    }

    private static void fibonaciRecursive(int count) {
        if(count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" ");
            System.out.print(n3);
            fibonaciRecursive(count - 1);
        }
    }


//    private static String getOutPutString(String input) {
//          String output, finalOutput;
//          output = input.replace("Red", "Blue");
//          finalOutput = output.replace("All Apples are Blue", "All Apples are Red");
//          System.out.println("finalOutput="+finalOutput);
//          return finalOutput;
//    }
}
