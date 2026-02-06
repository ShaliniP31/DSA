package algorithms;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {12, 5, 42, 98, 5, 56, 44};
        print(nums);
        mergeSort(nums, 0, nums.length - 1);
        print(nums);
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);

    }

    public static void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low, j = mid + 1;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }
        while (i <= mid) {
            temp.add(nums[i]);
            i++;
        }
        while (j <= high) {
            temp.add(nums[j]);
            j++;
        }
        i = 0;
        for (j = low; j <= high; j++) {
            nums[j] = temp.get(i++);
        }
    }
}
