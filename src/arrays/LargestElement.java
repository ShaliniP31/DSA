package arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
//        int[] arr = {8, 10, 5, 7, 9};
        System.out.println("Largest element in array is " + maxElement1(arr));
        System.out.println("Largest element in array is " + maxElement2(arr));

    }

    //Brute Force Approach - O(n log n)
    public static int maxElement1(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //Optimal Approach O(n)
    public static int maxElement2(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
