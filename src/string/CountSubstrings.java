package string;

import java.util.HashMap;

public class CountSubstrings {
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;//7

        System.out.println(countStrings(s, k));
    }

    public static int countStrings(String s, int k) {
        return count(s, k) - count(s, k - 1);
    }

    public static int count(String s, int k) {
        if (k < 0)
            return 0;
        int l = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            while (map.size() > k) {
                char ch = s.charAt(l);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0)
                    map.remove(ch);
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}
