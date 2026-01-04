package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        reverseArray(nums, 0, nums.length - 1);
        printArray(nums);

        reverseArray(nums, 0, 3);
        printArray(nums);
    }

    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        System.out.print("[ ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
