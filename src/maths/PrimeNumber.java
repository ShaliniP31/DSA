package maths;

public class PrimeNumber {
    public static void main(String[] args) {
//        int x = 153;
//        int x = 2;
        int x = 11;
//        int x = 36;
        System.out.println("Is " + x + " a prime number?: " + isPrime(x));
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }
}
