package recursion;

public class SumNNumbers {
    public static void main(String[] args) {
        sum1(3, 0);
        System.out.println("Sum is " + sum2(3));
    }

    //Parameterised way
    public static void sum1(int n, int sum) {
        if (n == 0) {
            System.out.println("Sum is " + sum);
            return;
        }
        sum1(n - 1, sum + n);
    }

    //Functional way
    public static int sum2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum2(n - 1);
    }

}
