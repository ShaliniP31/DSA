package arrays;

import java.util.ArrayList;

//Matching elements in both arrays even duplicates if they are multiple values
public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
//        int[] a = {1, 2, 2, 3, 3, 4, 5, 6};
//        int[] b = {2, 3, 3, 5, 6, 6, 7};
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};

//        ArrayList<Integer> inter = intersection1(a, b);
        ArrayList<Integer> inter = intersection1(a, b);

        printArray(inter);
    }

    public static ArrayList<Integer> intersection1(int[] a, int[] b) {
        ArrayList<Integer> inter = new ArrayList<>();
        int[] vis = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && vis[j] == 0 && (inter.isEmpty() || (inter.get(inter.size() - 1) != a[i]))) {
                    inter.add(a[i]);
                    vis[j] = 1;
                    break;
                }
            }
        }

        return inter;
    }

    public static ArrayList<Integer> intersection2(int[] a, int[] b) {
        ArrayList<Integer> inter = new ArrayList<>();
        int i = 0, j = 0, n1 = a.length, n2 = b.length;
        while (i < n1 && j < n2) {
            if (a[i] == b[j] && (inter.isEmpty() || (inter.get(inter.size() - 1) != a[i]))) {
                inter.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return inter;
    }

    public static void printArray(ArrayList<Integer> nums) {
        System.out.print("[ ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
