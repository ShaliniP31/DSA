package maths;

public class GCD {
    public static void main(String[] args) {
//        int n1 = 9, n2 = 12;
        int n1 = 20, n2 = 40;

        System.out.println("GCD of " + n1 + " & " + n2 + " is " + gcd1(n1, n2));
    }

    public static int gcd1(int n1, int n2) {
        int gcd = 0;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
