package string;

public class ReverseWords_LC151 {
    public static void main(String[] args) {
        String s = "the sky is blue";//"blue is sky the"
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;

            if (i >= 0 && !ans.isEmpty()) {
                ans.append(" ");
            }

            int len = 0;
            while (i >= 0 && s.charAt(i) != ' ') {
                len++;
                i--;
            }
            ans.append(s, i + 1, i + len + 1);
        }
        return ans.toString();
    }
}
