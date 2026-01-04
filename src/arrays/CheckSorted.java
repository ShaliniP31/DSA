package arrays;

public class CheckSorted {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {5, 4, 6, 7, 8};

        System.out.println("Is given array sorted: " + checkSorted(arr));
    }

    public static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
