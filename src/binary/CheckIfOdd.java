package binary;

public class CheckIfOdd {
    public static void main(String[] args) {
        int n = 32;
//        int n = 13;
//        System.out.println(checkOdd1(n));
        System.out.println(checkOdd2(n));
    }

    public static boolean checkOdd1(int n) {
        return (n ^ 1) == (n - 1);
    }

    public static boolean checkOdd2(int n) {
        return n % 2 == 1;
    }
}
