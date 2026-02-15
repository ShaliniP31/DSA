package dp;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
//        1 1 2 3 5 8 13
//        int n = 6;//8
        int n = 25;//75025
        System.out.println(fibRec(n));

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibMemo(n, dp));
    }

    public static int fibRec(int n) {
        if (n <= 2)
            return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static int fibMemo(int n, int[] dp) {
        if (n <= 2)
            return 1;
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fibMemo(n - 1, dp) + fibMemo(n - 2, dp);
        return dp[n];
    }
}
