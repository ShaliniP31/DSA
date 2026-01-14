package algorithms.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 8, 5, 1, 4, 23};
//        int[] nums = {3, 1, 2, 4, 1, 5, 6, 2, 4};
        int n = nums.length;

        printArray(nums);
        quickSort(nums, 0, n - 1);
        printArray(nums);
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
//            int partitionIdx = getPartitionIdx(nums, low, high);
            int partitionIdx = getPartitionIdxDesc(nums, low, high);
            quickSort(nums, low, partitionIdx - 1);
            quickSort(nums, partitionIdx + 1, high);
        }
    }

    public static int getPartitionIdx(int[] nums, int low, int high) {
        int pivot = nums[low], i = low, j = high;
        while (i<j){
            while(i<=high && nums[i]<=pivot)
                i++;
            while (j>=low && nums[j]>pivot)
                j--;
            if(i<j)
                swap(nums, i, j);
        }
        swap(nums, low, j);
        return j;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int getPartitionIdxDesc(int[] nums, int low, int high) {
        int pivot = nums[low], i = low, j = high;
        while (i<j){
            while(i<=high && nums[i]>=pivot)
                i++;
            while (j>=low && nums[j]<pivot)
                j--;
            if(i<j)
                swap(nums, i, j);
        }
        swap(nums, low, j);
        return j;
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
