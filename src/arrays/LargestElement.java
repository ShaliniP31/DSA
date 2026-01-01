package arrays;

public class LargestElement {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 1, 3, 0};
        int[] arr = {8, 10, 5, 7, 9};
        System.out.println("Largest element in array is " + maxElement(arr));
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
