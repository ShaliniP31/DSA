package algorithms.search;

public class BinarySearch_LC704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
//        int target = 2;

        System.out.println(search1(nums, target));
        System.out.println(search2(nums, target));
    }

    public static int search1(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {
        return binaryRec(nums, 0, nums.length - 1, target);
    }

    public static int binaryRec(int[] nums, int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target)
            return mid;
        else if (target > nums[mid])
            return binaryRec(nums, mid + 1, high, target);
        else
            return binaryRec(nums, low, mid - 1, target);
    }


}
