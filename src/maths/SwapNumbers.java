package maths;

public class SwapNumbers {
    public static void main(String[] args) {
//        int a = 10, b = 30;
        int a = 90, b = 10;
        swap1(a, b);
        swap2(a, b);
    }

    public static void swap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped numbers => a = " + a + " ,b = " + b);
    }

    public static void swap2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped numbers => a = " + a + " ,b = " + b);
    }
}
