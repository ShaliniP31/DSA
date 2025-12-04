package maths;

public class EvenOdd {
    public static void main(String[] args) {
//        int n = 12;
//        int n = 3;
        int n = 777;
        if (isEvenOdd(n))
            System.out.println(n + " is even.");
        else
            System.out.println(n + " is odd.");
    }

    public static boolean isEvenOdd(int n) {
        return n % 2 == 0;
    }
}
