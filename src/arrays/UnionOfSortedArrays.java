package arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfSortedArrays {

    //The union1 of two arrays can be defined as the common and distinct elements in
    // the two arrays. They need to be in ascending order.
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 4, 5};
        int[] a2 = {2, 3, 4, 4, 5, 5, 5};

//        ArrayList<Integer> union = union1(a1, a2);
        ArrayList<Integer> union = union2(a1, a2);

        printArray(union);
    }

    //Insert into Treeset => O(log n), for m+n elements, TC => O((m+n) * log(m+n))
    public static ArrayList<Integer> union1(int[] a1, int[] a2) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int k : a1) {
            set.add(k);
        }
        for (int j : a2) {
            set.add(j);
        }
        return new ArrayList<>(set);
    }

    public static ArrayList<Integer> union2(int[] a1, int[] a2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0, n1 = a1.length, n2 = a2.length;
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                if (union.isEmpty() || (union.get(union.size() - 1) != a1[i]))
                    union.add(a1[i]);
                i++;
            } else if (a1[i] > a2[j]) {
                if (union.isEmpty() || (union.get(union.size() - 1) != a2[j]))
                    union.add(a2[j]);
                j++;
            } else {
                if (union.isEmpty() || (union.get(union.size() - 1) != a1[i]))
                    union.add(a1[i]);
                i++;
                j++;

            }
        }
        while (i < n1) {
            if (union.isEmpty() || (union.get(union.size() - 1) != a1[i]))
                union.add(a1[i]);
            i++;
        }

        while (j < n2) {
            if (union.isEmpty() || (union.get(union.size() - 1) != a2[j]))
                union.add(a2[j]);
            j++;
        }

        return union;
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
