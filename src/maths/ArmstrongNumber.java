package maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int x = 153;
//        int x = 372;
//        int x = 1634;
//        int x = 35;
        System.out.println("Is " + x + " a armstrong number?: " + isArmstrong(x));
    }

    public static boolean isArmstrong(int x) {
        int sum = 0, count = 0, num = x;
        boolean flag = false;

        while (num > 0) {
            count++;
            num /= 10;
        }
        num = x;
        while (num > 0) {
            sum += Math.pow(num % 10, count);
            num /= 10;
        }

        if (sum == x)
            flag = true;

        return flag;
    }
}
