package heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReplaceByRank {
    public static void main(String[] args) {
//        int[] nums = {20, 15, 26, 2, 98, 6};//4 3 5 1 6 2
        int[] nums = {1, 5, 8, 15, 8, 25, 9};//1 2 3 5 3 6 4

        int[] res = replaceByRank(nums);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    public static int[] replaceByRank(int[] nums) {
        int[] res = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            pq.add(num);
        }
        int i = 1;
        while (!pq.isEmpty()) {
            int val = pq.remove();
            if (!map.containsKey(val)) {
                map.put(val, i);
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}
