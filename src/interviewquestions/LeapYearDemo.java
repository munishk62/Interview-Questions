package interviewquestions;

import java.util.Scanner;

// if(Y%400) == 0 || (Y%4==0) and (Y%100 != 0)
public class LeapYearDemo {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = Integer.valueOf(sc.nextLine());
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + "is a Leap Year");
          }
    }
}
