package arrays;

public class SquaresOfSorted_LC977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};//[0,1,9,16,100]
        int[] res = sortedSquares(nums);

        for(int num: res){
            System.out.print(num + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0, r = n - 1, idx = n - 1;

        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[idx--] = nums[l] * nums[l];
                l++;
            } else {
                res[idx--] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    }
}
