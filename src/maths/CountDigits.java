package maths;

public class CountDigits {
    public static void main(String[] args) {
//        int num = 12345;
        int num = 77891;
        count1(num);
        count2(num);
    }

    public static void count1(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println("Digit count is " + count);
    }

    public static void count2(int num) {
        int count = (int) Math.log10(num) + 1;
        System.out.println("Digit count is " + count);
    }
}
