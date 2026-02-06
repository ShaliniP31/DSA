package binary;

public class ClearIthBit {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        System.out.println(clearBit(n,k));
    }

    public static int clearBit(int n, int k){
        return (n & ~(1<<k));
    }
}
