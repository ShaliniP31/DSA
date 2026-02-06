package binary;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        int n = 9;
        int k = 2;
        System.out.println(removeLastSetBit(n, k));

    }

    public static int removeLastSetBit(int n, int k) {
        return (n & (n - 1));
    }
}
