package interviewquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Try {
    public static void main(String[] args) {
        HashMap<Integer, Student> studentMap = new HashMap<>();
        Student student1 = new Student(11, 2016, "Rakesh Kumar", 78);
        Student student2 = new Student(12, 2019, "Ashok Dinde", 60);
        Student student3 = new Student(13, 2020, "Shekhar Bansal", 59);
        Student student4 = new Student(14, 2021, "Gagan Thapa", 82);
        Student student5 = new Student(15, 2018, "Komal Thapa", 65);
        Student student6 = new Student(16, 2017, "Sunita Mathur", 79);

        studentMap.put(11, student1);
        studentMap.put(12, student2);
        studentMap.put(13, student3);
        studentMap.put(14, student4);
        studentMap.put(15, student5);
        studentMap.put(16, student6);

        String str = "Munish Kumar";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.get(c) != null) {
                map.put(c, map.get(c) + 1);

            }else {
                map.put(c, 1);
            }

        }
        map.forEach((key, count) ->  System.out.println("char=" + key + " count= " + count));





//        String str = "Hello World Welcome to Protean World";
//        String[] words = str.split(" ");
//        HashMap<String, Integer> map = new HashMap();
//        for(int i = 0; i< words.length; i++) {
//            String currentWord = words[i];
//
//            if(map.get(currentWord) != null) {
//                map.put(currentWord, map.get(currentWord) + 1);
//            }else {
//                map.put(currentWord, 1);
//            }
//        }
//
//
//        map.forEach((word, count) -> {
//            if(count > 1) {
//                System.out.println(word);
//            }
//        });
       // isPalindrome("lol");
        //Approach 1
//        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
//            if(entry.getValue().getPassingYear() >= 2018 && entry.getValue().getPercentage() >= 60) {
//                System.out.println("Roll Number = " + entry.getKey());
//                System.out.println("Name = " + entry.getValue().getName() + ", Passing Year = " + entry.getValue().getPassingYear() + ", Percentage = " + entry.getValue().getPercentage());
//            }
//        }

        //Approach 2
//        Iterator<Map.Entry<Integer, Student>> it = studentMap.entrySet().iterator();
//        while(it.hasNext()) {
//            Map.Entry<Integer, Student> entry = it.next();
//            if(entry.getValue().getPassingYear() >= 2018 && entry.getValue().getPassingYear() >= 60) {
//                 System.out.println("Roll Number = " + entry.getKey());
//                 System.out.println("Name = " + entry.getValue().getName() + ", Passing Year = " + entry.getValue().getPassingYear() + ", Percentage = " + entry.getValue().getPercentage());
//            }
//        }


        //Approach 3

        //studentMap.entrySet().stream().filter(e -> e.getValue().getPercentage() >= 60 && e.getValue().getPassingYear() >= 2018).forEach(e -> System.out.println("Name = " + e.getValue().getName() + ", Passing Year = " + e.getValue().getPassingYear() + ", Percentage = " + e.getValue().getPercentage()));
    }

    private static void isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                System.out.println("Not a Palindrome");
            }else {
                System.out.println("String is a Palindrome");
            }
            i++;
            j--;
        }
    }
}
