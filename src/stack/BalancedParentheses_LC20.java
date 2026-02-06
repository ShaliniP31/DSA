package stack;

import java.util.Stack;

public class BalancedParentheses_LC20 {
    public static void main(String[] args) {
        String s = "([])";
//        String s = "([)]";
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char b : brackets) {
            if (b == '(' || b == '{' || b == '[') {
                stack.add(b);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if ((c == '(' && b == ')') || (c == '{' && b == '}') || (c == '[' && b == ']'))
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
