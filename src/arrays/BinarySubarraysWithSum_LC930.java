package arrays;

public class BinarySubarraysWithSum_LC930 {
    public static void main(String[] args) {
//        int[] nums = {1, 0, 1, 0, 1};//4
//        int goal = 2;
        int[] nums = {0,0,0,0,0};//15
        int goal = 0;
        System.out.println(numSubarraysWithSum1(nums, goal));
        System.out.println(numSubarraysWithSum2(nums, goal));
    }

    public static int numSubarraysWithSum1(int[] nums, int goal) {
        int count = 0, n = nums.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == goal)
                    count++;
                else if (sum > goal)
                    break;
            }
        }
        return count;
    }

    public static int numSubarraysWithSum2(int[] nums, int goal) {
        return numSubArray(nums, goal) - numSubArray(nums, goal - 1);
    }

    public static int numSubArray(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int count = 0, n = nums.length, sum = 0;
        int l = 0;
        for (int r = 0; r < n; r++) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }
}
