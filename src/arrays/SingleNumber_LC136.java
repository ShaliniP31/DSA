package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_LC136 {
    public static void main(String[] args) {
//        int[] nums = {2,2,1};
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber1(nums));
        System.out.println(singleNumber2(nums));
        System.out.println(singleNumber3(nums));

    }

    public static int singleNumber1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = -1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    num = j;
                    break;
                }
            }
            if (num == -1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return -1;
    }

    public static int singleNumber3(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}

