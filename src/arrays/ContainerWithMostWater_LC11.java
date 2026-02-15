package arrays;

public class ContainerWithMostWater_LC11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};//49
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxWater = 0;
        while (l < r) {
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            maxWater = Math.max(maxWater, w * h);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}
