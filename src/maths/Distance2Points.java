package maths;

public class Distance2Points {
    public static void main(String[] args) {
//        int x1=3,y1=4,x2=7,y2=7;
        int x1 = 3, y1 = 4, x2 = 4, y2 = 3;

        System.out.println("Distance between given 2 points is "
                + Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) * 10000.0) / 10000.0);
    }
}
