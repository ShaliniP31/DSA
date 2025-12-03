package maths;

public class ReverseInteger_LC7 {
    public static void main(String[] args) {
//        int x = 123;
        int x = -123;
//        int x = 120;
//        int x = 1534236469;
//        int x = 10400;

        long rev = 0;
        boolean sign = false;

        if (Math.abs(x) != x) {
            x = Math.abs(x);
            sign = true;
        }

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            rev = 0;
        }

        if (sign)
            rev *= -1;

        System.out.println("Reversed integer value is " + (int) rev);
    }
}
