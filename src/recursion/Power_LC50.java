package recursion;

public class Power_LC50 {
    public static void main(String[] args) {
//        double x = 2.000;
//        int n = 10; //1024.0

        double x = 2.000;
        int n = -2; //0.2500
        System.out.println(myPow(x, n));
        System.out.println(myPowRecursive(x,n));
        System.out.println(myPowRecursive2(x,n));


    }

    public static double myPow(double x, int n) {
        double ans = 1;
        if (n < 0) {
            x = 1 / x;
            n = -1 * n;
        }
        while(n>0){
            ans *=x;
            n--;
        }
        return ans;
    }

    public static double myPowRecursive(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -1 * n;
        }
        return pow(x, n);
    }

    public static double pow(double x, int n) {
        if (n == 0)
            return 1;

        return x * pow(x, n - 1);
    }
    public  static double myPowRecursive2(double x, int n) {
        return pow2(x, (long) n);
    }

    public static double pow2(double x, long n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return pow2(1 / x, -n);
        if (n % 2 == 0)
            return pow2(x * x, n / 2);
        return x * pow2(x * x, (n - 1) / 2);

    }
}
