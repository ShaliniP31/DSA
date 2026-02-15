package string;

public class LargestOddNumber_LC1903 {
    public static void main(String[] args) {
//        String s = "52"; //5
        String s = "2204";//

        System.out.println(largestOddNumber(s));
    }

    public static String largestOddNumber(String num) {
        String ans = "";
        int ind = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }
        if (ind > -1) {
            ans = num.substring(0, ind+1);
        }
        return ans;
    }
}
