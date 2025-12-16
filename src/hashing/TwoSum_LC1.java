package hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_LC1 {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;

        int[] nums = {3,2,4};
        int target = 6;

        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                res[0] = i;
                res[1] = map.get(complement);
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
