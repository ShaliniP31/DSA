package arrays;

public class ProductExceptSelf_LC238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        int[] nums = {-1,1,0,3,-3};

        int[] res = productExceptSelf1(nums);
        printArray(res);

        res = productExceptSelf2(nums);
        printArray(res);
    }

    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            res[i] = prod;
        }
        return res;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int prefix = 1, suffix = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
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
