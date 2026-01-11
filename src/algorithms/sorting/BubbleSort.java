package algorithms.sorting;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] nums = {13, 46, 24, 52, 20, 9};
        int[] nums = {13, 16 , 27, 31, 88};
        printArray(nums);

//        sort1(nums);
        sort2(nums);
        printArray(nums);
    }

    public static void sort1(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 1; i--) {
            boolean swap = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void sort2(int[] nums) {
        int n = nums.length;
        bubble(nums, n - 1);
    }

    public static void bubble(int[] nums, int n) {
        if (n == 0)
            return;
        boolean swap = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                swap = true;
            }
        }
        if (!swap) {
            return;
        }

        bubble(nums, n - 1);
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
