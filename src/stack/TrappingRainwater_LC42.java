package stack;

public class TrappingRainwater_LC42 {
    public static void main(String[] args) {
//        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};//6
        int[] nums = {4,2,0,3,2,5};//9

        System.out.println(trap1(nums));
        System.out.println(trap2(nums));
    }

    public static int trap1(int[] height) {
        int n = height.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int lmax = 0, rmax = 0;
            for (int j = 0; j <= i; j++) {
                lmax = Math.max(lmax, height[j]);
            }
            for (int j = n - 1; j >= i; j--) {
                rmax = Math.max(rmax, height[j]);
            }
            count += Math.min(lmax, rmax) - height[i];
        }
        return count;
    }

    public static int trap2(int[] height) {
        int n = height.length;
        int count = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = height[0];
        for (int j = 1; j < n; j++) {
            lmax[j] = Math.max(lmax[j - 1], height[j]);
        }
        rmax[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rmax[j] = Math.max(rmax[j + 1], height[j]);
        }
        for (int i = 0; i < n; i++) {
            count += Math.min(lmax[i], rmax[i]) - height[i];
        }
        return count;
    }
}
