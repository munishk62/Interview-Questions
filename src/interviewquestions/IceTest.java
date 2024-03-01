package interviewquestions;

import com.sun.jdi.Value;

import java.util.*;

public class IceTest {
    public static void main(String[] args) {
        System.out.println("FFR="+findFactorialRecursively(7));
    }

    private static int findFactorialRecursively(int num) {
        if(num < 1) {
            return 1;
        } else {
            return num * findFactorialRecursively(num-1);

        }
    }
}
