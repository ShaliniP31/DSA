package recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        int count = 0;
        counter(count);
    }

    public static void counter(int count){
        if(count == 3){
            return;
        }
        System.out.println(count++);
        counter(count);
    }
}
