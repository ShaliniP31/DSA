package hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_LC217 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        return set.size() != nums.length;
    }
}
