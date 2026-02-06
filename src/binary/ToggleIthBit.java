package binary;

public class ToggleIthBit {
    public static void main(String[] args) {
        int n = 9;
        int k = 2;
//        System.out.println(toggleBit1(n, k));
        System.out.println(toggleBit2(n, k));

    }

    public static int toggleBit1(int n, int k) {
        if (((n >> k) & 1) == 1) {
            n = (n & ~(1 << k));
        } else {
            n = (n | (1 << k));
        }
        return n;
    }

    public static int toggleBit2(int n, int k) {
        return (n ^ (1 << k));
    }
}
