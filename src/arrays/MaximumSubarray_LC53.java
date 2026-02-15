package arrays;

public class MaximumSubarray_LC53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //6 arr=> 3 to 6
        System.out.println(maxSubArray1(nums));
        System.out.println(maxSubArray2(nums));

    }

    public static int maxSubArray1(int[] nums) {
        int n = nums.length, currSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += nums[j];
//                maxSum = Math.max(maxSum, currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(start + " " + end);
        return maxSum;
    }

    public static int maxSubArray2(int[] nums) {
        int n = nums.length, currSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            currSum += nums[i];
//            maxSum = Math.max(maxSum, currSum);
            if (currSum > maxSum) {
                maxSum = currSum;
                end = i;
            }
            if (currSum < 0) {
                currSum = 0;
                start = i+1;
            }
        }
        System.out.println(start + " " + end);
        return maxSum;
    }
}
