package binary;

public class PowerOf2 {
    public static void main(String[] args) {
//        int n = 32;
        int n = 13;
        System.out.println(powerOf22(n));
    }

    public static boolean powerOf21(int n) {
        String bin = Integer.toBinaryString(n);
        char[] bits = bin.toCharArray();
        int count = 0;
        for (char bit : bits) {
            if (bit == '1') {
                count++;
            }
        }
        return count == 1;
    }

    public static boolean powerOf22(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
