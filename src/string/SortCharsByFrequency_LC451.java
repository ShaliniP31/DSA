package string;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharsByFrequency_LC451 {
    public static void main(String[] args) {
        String s = "tree";//eert
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        pq.addAll(map.keySet());
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.remove();
            int count = map.get(ch);
            for (int i = 0; i < count; i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
