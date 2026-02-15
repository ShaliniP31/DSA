package heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class topKFrequent_LC347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};//1 2
        int k = 2;
//        int[] nums = {1};//1
//        int k = 1;

        int[] res = topKFrequent(nums, k);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        pq.addAll(map.keySet());
        System.out.println(pq);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.remove();
        }
        return res;
    }
}
