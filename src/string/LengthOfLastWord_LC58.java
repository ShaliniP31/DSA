package string;

public class LengthOfLastWord_LC58 {
    public static void main(String[] args) {
//        String s = "Hello World";//5
//        String s = "   fly me   to   the moon  ";//4
        String s = "a";//1
//        System.out.println(lengthOfLastWord1(s));
        System.out.println(lengthOfLastWord2(s));
    }

    public static int lengthOfLastWord1(String s) {
        String[] strs = s.trim().split("\\s+");
        String last = strs[strs.length - 1];
        return last.length();
    }

    public static int lengthOfLastWord2(String s) {
        int len = s.length() - 1;
        while (s.charAt(len) == ' ') {
            len--;
        }
        int lenLastWord = 0;
        for (int i = len; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                lenLastWord++;
            } else {
                break;
            }
        }
        return lenLastWord;
    }
}
