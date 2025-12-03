package maths;

public class PrintDivisors {
    public static void main(String[] args) {
        int n = 36;
//        int n = 19;
//        printDivisor1(n);
        printDivisor2(n);
    }

    // O(n) complexity
    public static void printDivisor1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Divisor is " + i);
            }
        }
    }

    //O(sqrt(n)) complexity
    public static void printDivisor2(int n) {
//        for (int i = 1; i <= Math.sqrt(n); i++) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Divisor is " + i);
                if ((n / i) != i) {
                    System.out.println("Divisor is " + n / i);
                }
            }
        }
    }
}
