package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight_LC1046 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 1, 8, 1};//1

        System.out.println(lastStoneWeight(nums));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int x = pq.remove();
            int y = pq.remove();
            if (x != y)
                pq.add(x - y);
        }
        if (pq.isEmpty())
            return 0;
        return pq.element();
    }
}
