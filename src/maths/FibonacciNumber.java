package maths;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 20;
        int n1 = 0, n2 = 1;

        for (int i = 2; i < n; i++) {
           int temp = n1;
           n1 = n1 + n2;
           n2 += temp;
        }

        System.out.println(n2);
    }
}
