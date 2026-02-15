package string;

public class MaxNestingDepth_LC1614 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1"; //3
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int n = s.length(), depth = 0, maxDepth = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }
            if (s.charAt(i) == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}
