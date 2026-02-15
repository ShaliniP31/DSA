package recursion;

public class Atoi_LC8 {
    public static void main(String[] args) {
//        String s = "  -12345";
        String s = " ";
//        int num = myAtoi(s);
        int num = myAtoiRecursive(s);
        System.out.println(num);
    }

    public static int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i == s.length()) {
            return 0;
        }

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        long num = 0;
        while (i < s.length()) {
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            num = num * 10 + s.charAt(i) - '0';

            if (sign * num <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if (sign * num >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign * num);
    }

    public static int myAtoiRecursive(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i == s.length())
            return 0;
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        return readInt(s, i, 0, sign);

    }

    public static int readInt(String s, int i, long num, int sign) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (sign * num);
        }

        num = num * 10 + s.charAt(i) - '0';

        if (sign * num <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if (sign * num >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return readInt(s, i + 1, num, sign);
    }
}
