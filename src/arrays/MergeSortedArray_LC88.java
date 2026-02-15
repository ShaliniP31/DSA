package arrays;

public class MergeSortedArray_LC88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        //Output: [1,2,2,3,5,6]

        merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;
        m = m - 1;
        n = n - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[k--] = nums1[m--];
            } else {
                nums1[k--] = nums2[n--];
            }
        }
        while (m >= 0) {
            nums1[k--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[k--] = nums2[n--];
        }
    }
}
