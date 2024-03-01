package interviewquestions;

// Java Program to Remove Duplicate Elements
// From the Array using extra space

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesInArray {
    public static void removeDuplicates(int a[], int n)
    {
        // if(array size if 0 or 1 array is already sorted)
        if (n == 0 || n == 1) {
            System.out.println("Array Length should be greater than 1");
        }

        int j = 0;

        // check if the ith element is not equal to
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element
        // will only be added once in the array
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[n - 1];
        System.out.println("j= " + j);

        // printing array elements
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args)
    {
        int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };

        int n = a.length;

        int j=0;

        // the function will modify the array a[]
        // such that the starting j elements
        // will be having all unique elements
        // and no element will be appearing more than
        // once Approach 1
         removeDuplicates(a, n);

        // Approach 2
        System.out.println("Approach using set");

        removeDuplicatesUsingSet(a);
    }

    private static void removeDuplicatesUsingSet(int[] a) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        int[] newArray = new int[set.size()];
        int j = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            newArray[j++] = it.next();
        }
        for(int el : newArray)
        System.out.println("New Array Element = " + el);
    }
}

