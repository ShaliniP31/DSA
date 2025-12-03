package maths;

public class PalindromeNumber_LC9 {
    public static void main(String[] args) {
//        int x = 121;
//        int x = -121;
//        int x = 10;
        int x = 4554;
        System.out.println("Is " + x + " a palindrome number?: " + isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int rev = 0, num = x;
        boolean flag = false;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if (rev == x)
            flag = true;

        return flag;
    }
}
