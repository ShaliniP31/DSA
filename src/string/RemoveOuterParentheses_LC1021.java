package string;

public class RemoveOuterParentheses_LC1021 {
    public static void main(String[] args) {
        String s = "(()())(())";//()()()
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0)
                    sb.append(ch);
                level++;
            } else if (ch == ')') {
                level--;
                if (level > 0)
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}
