package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kLargestElement_LC215 {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 1, 5, 6, 4};
//        int k = 2; //5
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4; //4

//        System.out.println(largestElement1(nums, k));
        System.out.println(largestElement2(nums, k));
    }

    public static int largestElement1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[(nums.length) - k];
    }

    public static int largestElement2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        return pq.element();
    }


}
