package hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_LC169 {
    public static void main(String[] args) {
//        int[] nums = {3,2,3};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int maxElem = 0;
        int size = nums.length / 2;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > size) {
                maxElem = m.getKey();
            }
        }
        return maxElem;
    }
}
