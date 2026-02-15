package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
//        int[] nums = {4, 7, 1, 0};//7,1,0
        int[] nums = {10, 22, 12, 3, 0, 6};//22,12,6
//        ArrayList<Integer> res = leaders1(nums);
        ArrayList<Integer> res = leaders2(nums);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }

    public static ArrayList<Integer> leaders1(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i; j < n; j++) {
                if (nums[j] > nums[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static ArrayList<Integer> leaders2(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int max = nums[n - 1];
        list.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                list.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
