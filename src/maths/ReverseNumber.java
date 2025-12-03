package maths;

public class ReverseNumber {
    public static void main(String[] args) {
//        int num = 7789;
//        int num = 4001;
        int num = 153423;

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number is " + rev);
    }
}
