package arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeatingAndMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 5, 7}; //7,4
        int[] res = repeatingAndMissingNumber(nums);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] repeatingAndMissingNumber(int[] nums) {
        int[] res = new int[2];
        int sum = 0, n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            sum += num;
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 2) {
                res[0] = m.getKey();
            }
        }
        sum = sum - res[0];
        int sum2 = (n * (n + 1)) / 2;
        res[1] = sum2 - sum;
        return res;
    }
}
