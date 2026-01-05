package arrays;

import java.util.TreeSet;

public class UnionOfSortedArrays {

    //The union of two arrays can be defined as the common and distinct elements in
    // the two arrays. They need to be in ascending order.
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 3, 4, 4, 5, 5, 5, 6};

        int[] union = union(a1, a2);
        printArray(union);

    }

    //Insert into Treeset => O(log n), for m+n elements, TC => O((m+n) * log(m+n))
    public static int[] union(int[] a1, int[] a2) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a1.length; i++) {
            set.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            set.add(a2[i]);
        }
        int[] union = new int[set.size()];

        int i = 0;
        for (Integer s : set) {
            union[i++] = s;
        }
        return union;
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
