package arrays;

public class MissingNumber_LC268 {
    public static void main(String[] args) {
//        int[] nums = {3,0,1};
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int arrSum = 0;
        for (int n : nums)
            arrSum += n;

        int n = nums.length;
        int sum = (n*(n+1))/2;

        return sum - arrSum;
    }

    public static int missingNumber2(int[] nums) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < nums.length; i++) {
            xor1 ^= nums[i];
            xor2 ^= i;
        }
        xor2 ^= nums.length;
        return xor1 ^ xor2;
    }
}
