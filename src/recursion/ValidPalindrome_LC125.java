package recursion;

public class ValidPalindrome_LC125 {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s = " ";

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        System.out.println("Give string is a palindrome: " +
                checkString(0, s.length(), s));
    }

    public static boolean checkString(int i, int n, String s) {
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return checkString(i + 1, n, s);
    }
}
