package recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Fibonacci of " + n + "th term is " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
