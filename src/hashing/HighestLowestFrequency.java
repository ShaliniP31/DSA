package hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {
    public static void main(String[] args) {
//        int[] arr = {10, 5, 10, 15, 10, 5};
        int[] arr = {2, 2, 3, 4, 4, 2};

        int maxEle = 0, maxFreq = 0;
        int minEle = 0, minFreq = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int key = m.getKey();
            int value = m.getValue();

            if (value > maxFreq) {
                maxEle = key;
                maxFreq = value;
            }

            if (value < minFreq) {
                minEle = key;
                minFreq = value;
            }
        }

        System.out.println("Highest Frequency Element: " + maxEle);
        System.out.println("Lowest Frequency Element: " + minEle);

    }
}
