package hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_LC217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
//        int[] nums = {1,2,3,4};

        System.out.println(containsDuplicate1(nums));
        System.out.println(containsDuplicate2(nums));
    }

    //Time limit exceeded for large arrays
    public static boolean containsDuplicate1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() != nums.length) {
            return true;
        }
        return false;
    }
}
