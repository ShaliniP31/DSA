package maths;

public class FibonacciNumber_LC509 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int n1 = 0, n2 = 1;

        if (n == 0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            int temp = n1;
            n1 = n2;
            n2 += temp;
        }
        return n2;
    }
}
