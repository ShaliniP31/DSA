package arrays;

public class ReplaceWithGreatestRight_LC1299 {
    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};//18,6,6,6,1,-1
        int[] res = replaceElements1(nums);
//        int[] res = replaceElements2(nums);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }

    public static int[] replaceElements1(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int max;
        for (int i = 0; i < n; i++) {
            max = -1;
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, arr[j]);
            }
            res[i] = max;
        }
        return res;
    }

    public static int[] replaceElements2(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            res[i] = max;
            max = Math.max(arr[i], max);
        }
        return res;
    }
}
