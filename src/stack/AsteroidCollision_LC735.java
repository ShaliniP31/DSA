package stack;

import java.util.LinkedList;

public class AsteroidCollision_LC735 {
    public static void main(String[] args) {
        int[] nums = {3, 5, -6, 2, -1, 4};//-6,2,4
        int[] res = asteroidCollision(nums);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                list.add(asteroid);
            } else {
                while (!list.isEmpty() && list.getLast() > 0 && list.getLast() < Math.abs(asteroid)) {
                    list.removeLast();
                }
                if (!list.isEmpty() && list.getLast() == Math.abs(asteroid))
                    list.removeLast();
                else if (list.isEmpty() || list.getLast() < 0) {
                    list.add(asteroid);
                }
            }
        }


        int[] collision = new int[list.size()];
        int i = 0;
        while (!list.isEmpty()) {
            collision[i++] = list.remove();
        }
        return collision;
    }
}
