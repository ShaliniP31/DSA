package arrays;

public class CheckSortedAndRotated_LC1752 {
    public static void main(String[] args) {
//        int[] nums = {3,4,5,1,2};
        int[] nums = {2,1,3,4};
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (checkSorted(nums)) {
                return true;
            }
            rotateArray(nums);
            i++;
        }
        return false;
    }

    public static boolean checkSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void rotateArray(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
    }
}
