package arrays;

public class MaxConsecutiveOnes_LC1004 {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};//6
//        int k = 2;
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};//10
        int k = 3;
//        System.out.println(longestOnes1(nums, k));
        System.out.println(longestOnes2(nums, k));
    }

    public static int longestOnes1(int[] nums, int k) {
        int n = nums.length;
        int z, len, maxlen = 0;
        for (int i = 0; i < n; i++) {
            z = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0)
                    z++;
                if (z <= k) {
                    len = j - i + 1;
                    maxlen = Math.max(len, maxlen);
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }

    public static int longestOnes2(int[] nums, int k) {
        int n = nums.length;
        int z = 0, len = 0, maxlen = 0, l = 0, r = 0;
        while (r < n) {
            if (nums[r] == 0) {
                z++;
            }
            while (z > k) {
                if (nums[l] == 0) {
                    z--;
                }
                l++;
            }
//            if (z <= k) {
            len = r - l + 1;
            maxlen = Math.max(len, maxlen);
//            }
            r++;
        }
        return maxlen;
    }
}
