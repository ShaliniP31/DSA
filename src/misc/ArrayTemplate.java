package misc;

public class ArrayTemplate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printArray(nums);
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
