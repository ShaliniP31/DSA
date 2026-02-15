package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class kSmallestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2; //2
//        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
//        int k = 4; //3

//        System.out.println(smallestElement1(nums, k));
        System.out.println(smallestElement2(nums, k));
    }

    public static int smallestElement1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[(nums.length) - k];
    }

    public static int smallestElement2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.element();
    }
}
