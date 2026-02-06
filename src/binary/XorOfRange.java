package binary;

public class XorOfRange {
    public static void main(String[] args) {
        int l = 3, r = 5;
        System.out.println(xorOfRange(l, r));
    }

    public static int xorOfRange(int l, int r) {
        int xor = 0;
        for (int i = l; i <= r; i++) {
            xor ^= i;
        }
        return xor;
    }
}
