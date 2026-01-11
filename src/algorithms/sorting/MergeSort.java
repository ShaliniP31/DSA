package algorithms.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class MergeSort {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 8, 5, 1, 4, 23};
        int[] nums = {3, 1, 2, 4, 1, 5, 6, 2, 4};
        int n = nums.length;

        printArray(nums);
        mergeSort(nums, 0, n - 1);
        printArray(nums);

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
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] < nums[right]) {
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);
            }
        }

        while (left <= mid) {
            temp.add(nums[left++]);
        }

        while (right <= high)
            temp.add(nums[right++]);

        Iterator<Integer> itr = temp.iterator();
        while (itr.hasNext() && low <= high) {
            nums[low++] = itr.next();
        }
    }

    public static void printArray(int[] nums) {
        System.out.print("[ ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
