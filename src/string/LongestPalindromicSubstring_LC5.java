package string;

public class LongestPalindromicSubstring_LC5 {
    public static void main(String[] args) {
        String s = "babad";//bab or aba
//        String s = "bb";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0 || n == 1) {
            return s;
        }
        StringBuilder sb;
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j+1);
                sb = new StringBuilder();
                sb.append(sub);
                if (sub.equals(sb.reverse().toString())) {
                    if (sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
}
