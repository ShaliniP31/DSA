package arrays;

public class CountNiceSubarrays_LC1248 {
    public static void main(String[] args) {
//        int[] nums = {1,1,2,1,1};//2
//        int k = 3;
        int[] nums = {2,2,2,1,2,2,1,2,2,2};//16
        int k = 2;
        System.out.println(numberOfSubarrays1(nums,k));
        System.out.println(numberOfSubarrays2(nums,k));
    }
    public static int numberOfSubarrays1(int[] nums, int k) {
        int count = 0, oddCount = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            oddCount = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 1) {
                    oddCount++;
                }
                if (oddCount == k) {
                    count++;
                } else if (oddCount > k) {
                    break;
                }
            }
        }
        return count;
    }

    public static int numberOfSubarrays2(int[] nums, int k) {
        return subarrays(nums, k) - subarrays(nums, k - 1);
    }

    public static int subarrays(int[] nums, int k) {
        if (k < 0)
            return 0;
        int count = 0, oddCount = 0;
        int l = 0;
        int n = nums.length;
        for (int r = 0; r < n; r++) {
            if (nums[r] % 2 == 1) {
                oddCount++;
            }
            while (oddCount > k) {
                if (nums[l] % 2 == 1) {
                    oddCount--;
                }
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}
