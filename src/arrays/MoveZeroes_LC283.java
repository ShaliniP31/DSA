package arrays;

public class MoveZeroes_LC283 {
    public static void main(String[] args) {
//        int[] nums = {1, 0, 2, 3, 0, 4, 0, 1};
        int[] nums = {0, 0, 1, 0, 0, 3, 12};
//        int[] nums = {1, 2, 3};

//        moveZeroes1(nums);
        moveZeroes2(nums);
        printArray(nums);
    }

    public static void moveZeroes1(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                temp[j++] = num;
            }
        }
        if (j > 0) {
            System.arraycopy(temp, 0, nums, 0, j);
        }

        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    public static void moveZeroes2(int[] nums) {
        int i = -1, n = nums.length;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                i = j;
                break;
            }
        }
        if (i == -1)
            return;

        int j = i + 1;

        while (j < n && i < n) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            while (i < n && nums[i] != 0) {
                i++;
            }
            while (j < n && nums[j] == 0) {
                j++;
            }
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
