package recursion;

public class RecursionBasics {

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(palindromeCheck("madam", 0));
        System.out.println(decimalToBinary(25, ""));
        System.out.println(sumOfNaturalNums(10));
        System.out.println(fibonacci(5));
    }

    public static String reverse(String s) {
        if (s.isEmpty())
            return "";
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean palindromeCheck(String s, int i) {
        if (i > s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            return false;
        }
        return palindromeCheck(s, i + 1);
    }

    public static String decimalToBinary(int n, String res) {
        if (n == 0) {
            return res;
        }
        res = n % 2 + res;
        n = n / 2;
        return decimalToBinary(n, res);
    }

    public static int sumOfNaturalNums(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNums(n - 1);
    }

    public static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
