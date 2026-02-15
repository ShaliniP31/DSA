package heap;

import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        int[] nums = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        sortKsorted(nums, k);
        for (int num:nums){
            System.out.print(num+ " ");
        }
    }

    public static void sortKsorted(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                nums[i++] = pq.remove();
            }
        }
        while (i < nums.length) {
            nums[i++] = pq.remove();
        }
    }
}
