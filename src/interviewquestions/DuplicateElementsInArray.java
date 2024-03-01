package interviewquestions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
//.import org.apache.commons.lang3.StringUtils;

// Approach 1 => Brute Force Approach -- Comparing each element with others
// Approach 2 => check if element present in Set

class DuplicateElementsInArray {
    public static void main(String[] args) {
        int Array[] = {10, 20, 30, 20, 30, 50, 60, 50};
        bruteForce(Array);
        extraMemory(Array);
    }

    private static void extraMemory(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++) {
            if(set.contains(array[i])) {
                System.out.println("Duplicate Element = " + array[i]);
            } else {
                set.add(array[i]);
            }
        }
    }

    private static void bruteForce(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j< array.length; j++) {
                if(array[i] == array[j]) {
                    System.out.println("Duplicate Element = " + array[i]);
                }
            }
        }
    }

}