package string;

import java.util.Arrays;
import java.util.HashSet;

public class SubstringsWithAllChars_LC1358 {
    public static void main(String[] args) {
//        String s = "abcabc";//10
        String s = "aaacb";//3

        System.out.println(numberOfSubstrings1(s));
        System.out.println(numberOfSubstrings2(s));
    }

    //tle
    public static int numberOfSubstrings1(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(s.charAt(j));
                if (set.size() == 3) {
//                    count++;
                    count += (n - j); //do need for further traversing
                    break;
                }
            }
        }
        return count;
    }

    public static int numberOfSubstrings2(String s) {
        int[] lastSeen = new int[3];
        Arrays.fill(lastSeen, -1);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lastSeen[ch - 'a'] = i;
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                count = count + (1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));
            }
        }
        return count;
    }
}
