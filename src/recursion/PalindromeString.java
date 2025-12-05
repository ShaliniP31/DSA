package recursion;

public class PalindromeString {
    public static void main(String[] args) {
//        String str = "madam";
//        String str = "madsm";
        String str = "ABCDCBA";

        int n = str.length() - 1;

        System.out.println("Is " + str + " a palindrome string: " + check(0, n, str));

    }

    public static boolean check(int i, int n, String str) {
        if (i >= n / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(n - i)) {
            return false;
        }
        return check(i + 1, n, str);
    }

}
