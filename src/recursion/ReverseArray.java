package recursion;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 2};
        int[] arr = {1, 2, 3, 4, 2, 5};

        System.out.println("Original array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        reverse1(0, arr.length - 1, arr);

        System.out.println("\nReversed array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

//        int[] arr1 = {1, 2, 3, 4, 2};
        int[] arr1 = {1, 2, 3, 4, 2, 5};

        reverse2(0, arr1);

        System.out.println("\nReversed array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    //with 2 pointers
    public static void reverse1(int i, int j, int[] arr) {
        if (i >= j) {
            return;
        }
        swap(i, j, arr);
        i++;
        j--;
        reverse1(i, j, arr);
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //with 1 pointer
    public static void reverse2(int i, int[] arr) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        swap(i, n - i - 1, arr);
        i++;
        reverse2(i, arr);
    }
}
