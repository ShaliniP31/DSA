package recursion;

public class PrintNNumsDesc {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(--n);
    }
}
