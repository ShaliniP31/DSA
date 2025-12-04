package maths;

public class NthTermAP {
    public static void main(String[] args) {
//        int a1 = 2, a2 = 3, n = 4;
        int a1 = 1, a2 = 3, n = 10;
        System.out.println(n + "th term of the AP is " + term1(a1, a2, n));
    }

    public static int term1(int a1, int a2, int n) {
        int d = a2 - a1;
        for (int i = 1; i < n; i++) {
            a1 += d;
        }
        return a1;
    }

    public static int term2(int a1, int a2, int n) {
        int d = a2 - a1;
        return a1 + (n - 1) * d;
    }
}
