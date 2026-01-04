package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInSorted_LC26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 4,4,4,4,4,5, 55, 77,98};
//        int[] nums = {-3, -1, 0, 0, 0, 3, 3}; //failed testcase for method 1

        System.out.println(removeDuplicates1(nums));
//        removeDuplicates2(nums);
    }

    //Brute force - O(N) space due to set used/ Also does not maintain order
    public static int removeDuplicates1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int i = 0;
        for (int s : set) {
            nums[i++] = s;
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
        return i;
    }

    //Using pointer and traversing same array
    public static int removeDuplicates2(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i + 1];
            }
        }
        for (int n : nums) {
            System.out.print(n + " ");
        }
        return j;
    }
}
