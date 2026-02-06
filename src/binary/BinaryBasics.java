package binary;

public class BinaryBasics {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(127));
        System.out.println(convertBinaryToDecimal("1111111"));
        swapNumbers(3, 5);
    }

    public static String convertDecimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            n /= 2;
        }

        return sb.reverse().toString();
    }

    public static int convertBinaryToDecimal(String bin) {
        char[] bins = bin.toCharArray();
        int sum = 0, n = bins.length - 1;
        for (int i = 0; i <= n; i++) {
            sum = sum + (Integer.parseInt(String.valueOf(bins[n - i])) * (int) Math.pow(2, i));
        }
        return sum;
    }

    public static void swapNumbers(int a, int b) {
        System.out.println(a + " " + b);
        a = a ^ b;
        System.out.println(a);
        b = a ^ b;
        System.out.println(b);
        a = a ^ b;
        System.out.println(a);
        System.out.println(a + " " + b);
    }
}
