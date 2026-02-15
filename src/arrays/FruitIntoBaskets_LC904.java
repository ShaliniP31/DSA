package arrays;

import java.util.HashMap;

public class FruitIntoBaskets_LC904 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2};//4
        System.out.println(totalFruit1(nums));
        System.out.println(totalFruit2(nums));
    }

    public static int totalFruit1(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = fruits.length;
        int maxlen = 0;
        int k = 2;

        for (int i = 0; i < n; i++) {
            map = new HashMap<>();
            for (int j = i; j < n; j++) {
                map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
                if (map.size() <= k) {
                    maxlen = Math.max(maxlen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }

    public static int totalFruit2(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0, n = fruits.length;
        int maxlen = 0;
        int k = 2;

        while (r < n) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while (map.size() > k) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return subarrays(nums, k) - subarrays(nums, k - 1);
    }

    public int subarrays(int[] nums, int k) {
        if (k < 0)
            return 0;
        int count = 0, oddCount = 0;
        int l = 0;
        int n = nums.length;
        for (int r = 0; r < n; r++) {
            if (nums[r] % 2 == 1) {
                oddCount++;
            }
            while (oddCount > k) {
                if (nums[l] % 2 == 1) {
                    oddCount--;
                }
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}
