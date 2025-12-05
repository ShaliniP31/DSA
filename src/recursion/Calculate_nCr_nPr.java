package recursion;

public class Calculate_nCr_nPr {
    public static void main(String[] args) {
//        int n = 5, r = 2;
        int n = 2, r = 4;
        System.out.println("nCr value is " + nCr(n, r));
        System.out.println("nPr value is " + nPr(n, r));
    }

    public static int nCr(int n, int r) {
        if (r > n)
            return 0;
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static int nPr(int n, int r) {
        if (r > n)
            return 0;
        return fact(n) / fact(n - r);
    }

    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }
}
