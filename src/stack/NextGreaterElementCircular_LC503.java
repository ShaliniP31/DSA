package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementCircular_LC503 {
    public static void main(String[] args) {
//        int[] nums1 = {1, 3, 4, 2}; //3,4,-1,3
        int[] nums1 = {1, 2, 1}; //2, -1, 2

//        int[] res = nextGreaterElement1(nums1);
//        int[] res = nextGreaterElement2(nums1);
        int[] res = nextGreaterElement3(nums1);
        print(res);
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElement1(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    res[i] = nums[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] > nums[i]) {
                        res[i] = nums[j];
                        break;
                    }
                }
            }
        }
        return res;
    }

    public static int[] nextGreaterElement2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < i + n; j++) {
                int idx = j % n;
                if (nums[idx] > nums[i]) {
                    res[i] = nums[idx];
                    break;
                }
            }
        }
        return res;
    }

    public static int[] nextGreaterElement3(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for (int i = (2*n-1); i >= 0; i--) {
            int j = i%n;
            while (!stack.isEmpty() && stack.peek() <= nums[j]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[j] = -1;
            } else {
                res[j] = stack.peek();
            }
            stack.push(nums[j]);
        }
        return res;
    }
}
