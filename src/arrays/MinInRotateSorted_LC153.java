package arrays;

public class MinInRotateSorted_LC153 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
//        int[] nums = {11, 13, 15, 17};

        System.out.println(findMin1(nums));
        System.out.println(findMin2(nums));
    }

    public static int findMin1(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                min = nums[i];
                break;
            }
        }
        return min;
    }

    public static int findMin2(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[high] < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}

