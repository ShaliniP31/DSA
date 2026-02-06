package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] nums1 = {4,8,5,2,25}; //2,5,2,4,-1,-1
//        int[] res = nextGreaterElement1(nums1);
        int[] res = nextGreaterElement2(nums1);
        print(res);
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElement1(int[] nums1) {
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] < nums1[i]) {
                    res[i] = nums1[j];
                    break;
                }
            }
        }
        return res;
    }

    public static int[] nextGreaterElement2(int[] nums1) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums1.length];
        for (int i = nums1.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums1[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(nums1[i]);
        }
        return res;
    }
}
