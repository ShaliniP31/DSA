package maths;

public class GCD {
    public static void main(String[] args) {
//        int n1 = 9, n2 = 12;
//        int n1 = 20, n2 = 40;
//        int n1 = 52, n2 = 10;
        int n1 = 556, n2 = 256;
//        System.out.println("GCD of " + n1 + " & " + n2 + " is " + gcd1(n1, n2));
        System.out.println("GCD of " + n1 + " & " + n2 + " is " + gcd2(n1, n2));

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

    public static int gcd2(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
        }
        if (n1 == 0)
            return n2;
        else
            return n1;
    }
}
