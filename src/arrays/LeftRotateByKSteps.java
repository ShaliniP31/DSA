package arrays;

public class LeftRotateByKSteps {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        printArray(nums);
//        rotateArray1(nums, k);
//        rotateArray2(nums, k);
        rotateArray3(nums, k);
        printArray(nums);
    }

    public static void rotateArray1(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        while (k > 0) {
            int temp = nums[0];
            for (int i = 0; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[n - 1] = temp;
            k--;
        }
    }

    public static void rotateArray2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        System.arraycopy(nums, 0, temp, 0, k);
        System.arraycopy(nums, k, nums, 0, n - k);
        System.arraycopy(temp, 0, nums, n - k, k);
    }

    public static void rotateArray3(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
        reverseArray(nums, 0, n - 1);
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
