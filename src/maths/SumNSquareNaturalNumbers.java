package maths;

public class SumNSquareNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
//        int n = 30;
        System.out.println("Sum of square of " + n + " natural numbers is " + sum1(n));
        System.out.println("Sum of square of " + n + " natural numbers is " + sum2(n));
    }

    public static int sum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int sum2(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
}
