package arrays;

public class LeftRotateBy1Step {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printArray(nums);
        rotateArray(nums);
        printArray(nums);
    }

    public static void rotateArray(int[] nums) {
        int num = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = num;
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
