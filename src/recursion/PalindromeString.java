package recursion;

public class PalindromeString {
    public static void main(String[] args) {
//        String str = "madam";
        String str = "raceacar";
//        String str = "ABCDCBA";
        System.out.println("Is " + str + " a palindrome string: " + check(0, str.length(), str));

    }

    public static boolean check(int i, int n, String str) {
        if (i >= n / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        return check(i + 1, n, str);
    }

}
