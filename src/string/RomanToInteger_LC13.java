package string;

import java.util.HashMap;

public class RomanToInteger_LC13 {
    public static void main(String[] args) {
//        String s = "III";//3
        String s = "MCMXCIV";//1994
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        char[] r = s.toCharArray();
        int num = values.get(r[r.length - 1]);
        for (int i = r.length - 2; i >= 0; i--) {
            if (values.get(r[i]) < values.get(r[i + 1]))
                num -= values.get(r[i]);
            else
                num += values.get(r[i]);
        }

        return num;
    }
}
