package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII_LC229 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> res = majorityElement(nums);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > n / 3) {
                list.add(m.getKey());
            }
        }
        return list;
    }
}
