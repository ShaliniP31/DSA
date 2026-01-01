package arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 1, 3, 0};
        int[] arr = {8, 10, 5, 7, 9};
        System.out.println("Second smallest element in array is " + minElement(arr));
    }

    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for (int a : arr) {
            if (a < min) {
                secMin = min;
                min = a;
            }
            if (a > min && a < secMin) {
                secMin = a;
            }
        }
        return secMin;
    }
}
