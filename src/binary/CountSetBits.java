package binary;

public class CountSetBits {
    public static void main(String[] args) {
//        int n = 32;
        int n = 13;
//        System.out.println(countSetBits1(n));
//        System.out.println(countSetBits2(n));
//        System.out.println(countSetBits3(n));
        System.out.println(countSetBits4(n));
    }

    public static int countSetBits1(int n) {
        String bin = Integer.toBinaryString(n);
        char[] bits = bin.toCharArray();
        int count = 0;
        for (char bit : bits) {
            if (bit == '1') {
                count++;
            }
        }
        return count;
    }

    public static int countSetBits2(int n) {
       int count = 0;
       while(n>0){
           if(n%2==1){
               count++;
           }
           n/=2;
       }
        return count;
    }

    public static int countSetBits3(int n) {
        int count = 0;
        while(n>0){
            count += (n&1);
            n = n>>1;
        }
        return count;
    }

    public static int countSetBits4(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n & (n-1);
        }
        return count;
    }

}
