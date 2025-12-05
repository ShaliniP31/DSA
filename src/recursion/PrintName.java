package recursion;

public class PrintName {
    public static void main(String[] args) {
        int n = 5;
        printName(0, n, "Hello");
    }

    public static void printName(int i, int n, String name) {
        if (i == n) {
            return;
        }
        System.out.print(name + " ");
        printName(++i, n, name);
    }

}
