package stack;

import java.util.Arrays;
import java.util.Stack;

public class NumberOfNextGreaterElements {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2}; //3,4,-1,-1
        int[] res = nextGreaterElement2(nums1);
        print(res);
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElement2(int[] nums1) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums1.length];
        for (int i = nums1.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums1[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.size();
            }
            stack.push(nums1[i]);
        }
        return res;
    }
}
