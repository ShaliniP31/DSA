package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_LC1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        printArray(twoSum1(nums, target));
        printArray(twoSum2(nums, target));
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res, -1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                res[0] = i;
                res[1] = map.get(comp);
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
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
