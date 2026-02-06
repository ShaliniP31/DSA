package binary;

import java.util.HashMap;
import java.util.Map;

public class MultipleSingleNumber_LC260 {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int i = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                res[i++] = m.getKey();
            }
        }
        return res;
    }

    //not understood
    public int[] singleNumbe2r(int[] nums) {

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        //find rightmost set bit
        int setBit = xor & (-xor);
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & setBit) != 0)
                num1 ^= num;
            else
                num2 ^= num;
        }
        return new int[] { num1, num2 };
    }
}
