package binary;

public class CheckIthBitSet {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
//        System.out.println(checkIthBitSet1(n, k));
        System.out.println(checkIthBitSet2(n, k));
//        System.out.println(checkIthBitSet3(n, k));
    }

    public static boolean checkIthBitSet1(int n, int k) {
        String bin = Integer.toBinaryString(n);
        if (k >= bin.length()) {
            return false;
        }
        return bin.charAt((bin.length() - 1) - k) == '1';
    }

    public static boolean checkIthBitSet2(int n, int k) {
        System.out.println(n & (1<<k));
        return (n & (1<<k)) != 0;
    }

    public static boolean checkIthBitSet3(int n, int k) {
        return ((n>>k) & 1) == 1;
    }

}
