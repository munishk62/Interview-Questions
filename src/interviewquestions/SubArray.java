package interviewquestions;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
class SubArray {
    public static void main(String[] args) {
        System.out.println("Enter number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter number of elements of Array : ");
        Scanner elements = new Scanner(System.in);
        int array[] = new int[100];

        for(int i =0; i < n; i++) {
            array[i] = Integer.parseInt(elements.nextLine());
        }

        System.out.println("Please Enter Sum : ");
        Scanner sumSc = new Scanner(System.in);
        int sum = Integer.parseInt(sumSc.nextLine());

        SubArray(array, n, sum);
    }

    static int SubArray( int arr[], int number, int sum) {
        int currentSum;
        for(int i = 0; i < number; i++) {
            currentSum = arr[i];
            for(int j = i + 1; j <= number; j++) {
                if(currentSum == sum) {
                    int p = j -1;
                    System.out.println("Sum found between indexes : " + i + "and " + p);
                    return 1;
                }
                if(currentSum > sum || j==number) {
                    break;
                }
                currentSum = currentSum + arr[j];
            }
        }
        System.out.println("No Sub Array Found :");
        return 0;
    }
}
*/

public class  SubArray {

    public static void main(String[] args) {
        System.out.println("Please enter number of elements");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] array = new int[100];
        System.out.println("Please enter array elements");
        Scanner elements = new Scanner(System.in);
        for(int i =0; i < n; i++) {
            array[i] = Integer.parseInt(elements.nextLine());
        }

        System.out.println("Please enter sum");
        Scanner sumSc = new Scanner(System.in);
        int sum = Integer.parseInt(sumSc.nextLine());

        SubArray(array, n, sum);
    }

    private static int SubArray(int[] arr, int n, int sum) {

        int currentSum;
        for(int i = 0; i <= n; i++) {
            currentSum = arr[i];

            for(int j = i + 1; j <= n; j++) {
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
}