package dp;

public class UniquePathsInGrid_LC62 {
    public static void main(String[] args) {
//        int m = 3, n = 2;//3
        int m = 3, n = 7;//28
        System.out.println(uniquePaths1(m, n));
    }

    public static int uniquePaths1(int m, int n) {
        if (m == 1 && n == 1)
            return 1;
        if (m == 0 || n == 0)
            return 0;
        return uniquePaths1(m - 1, n) + uniquePaths1(m, n - 1);
    }
}
