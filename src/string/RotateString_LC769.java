package string;

public class RotateString_LC769 {
    public static void main(String[] args) {
//        String s = "abcde", goal = "cdeab"; //true
        String s = "abcde", goal = "cdaeb";//false

        System.out.println(rotateString1(s, goal));
    }

    public static boolean rotateString1(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
