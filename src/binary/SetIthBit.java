package binary;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 9;
        int k = 2;
//        System.out.println(setBit2(n, k));
        System.out.println(setBit1(n,k));
    }

    public static int setBit1(int n, int k) {
        String bin = Integer.toBinaryString(n);
        if (bin.charAt((bin.length() - 1) - k) != '1') {
            char[] bits = bin.toCharArray();
            bits[(bin.length() - 1) - k] = '1';
            bin = String.valueOf(bits);
            n = Integer.parseInt(bin, 2);
        }
        return n;
    }

    public static int setBit2(int n, int k) {
        return (n | (1 << k));
    }
}
