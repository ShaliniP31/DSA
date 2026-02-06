package arrays;

// Sort Colors in LC
public class Move012_LC75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        printArray(nums);

//        sortColors1(nums);
        sortColors2(nums);
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        System.out.print("[ ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void sortColors1(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int num : nums) {
            if (num == 0)
                c0++;
            else if (num == 1)
                c1++;
            else
                c2++;
        }
        int j = 0;
        for (int i = 0; i < c0; i++) {
            nums[j++] = 0;
        }

        for (int i = 0; i < c1; i++) {
            nums[j++] = 1;
        }

        for (int i = 0; i < c2; i++) {
            nums[j++] = 2;
        }
    }

    public static void sortColors2(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
