package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyChars {
    public static void main(String[] args) {
        String str = "Hello World";

        Map<Character, Integer> map = new HashMap<>();
        for (char a : str.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }
}
