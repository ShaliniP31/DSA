package algorithms.search;

public class LinearSearch {
    public static void main(String[] args) {
        int x = 3;
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Value " + x + " index is " + linearSearch(nums, x));
    }

    public static int linearSearch(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }
}