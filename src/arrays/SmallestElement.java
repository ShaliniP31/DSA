package arrays;

public class SmallestElement {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 1, 3, 0};
        int[] arr = {8, 10, 5, 7, 9};
        System.out.println("Smallest element in array is " + minElement(arr));
    }

    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
}
