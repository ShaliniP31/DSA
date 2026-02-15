package string;

public class LongestSubStringNonRepeatChars_LC3 {
    public static void main(String[] args) {
        String s;
        s = "dvdf";//3
//        s="aab";//2
        s = "abcabcbb";//3
//        s="bbbbb";//1

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] visited = new int[128];
        int l = 0, len = 0, maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (visited[c] == 1) {
                while (visited[c] == 1) {
                    char repeat = s.charAt(l);
                    visited[repeat] = 0;
                    l++;
                    len--;
                }
            }
            visited[c] = 1;
            len++;
            maxlen = Math.max(len, maxlen);
        }
        return maxlen;
    }
}
