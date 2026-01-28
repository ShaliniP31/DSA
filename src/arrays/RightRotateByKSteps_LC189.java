package arrays;

public class RightRotateByKSteps_LC189 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] nums = {-1};
        int k = 2;
        printArray(nums);
//        rotateArray1(nums, k);
        rotateArray2(nums, k);
        printArray(nums);
    }

    public static void rotateArray1(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        System.arraycopy(nums, n - k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, n - k);
        System.arraycopy(temp, 0, nums, 0, k);
    }

    public static void rotateArray2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
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
