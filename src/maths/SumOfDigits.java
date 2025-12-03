package maths;

public class SumOfDigits {
    public static void main(String[] args) {
//        int number = 10;
        int number = 991;
//        int number = -32;
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits in number is " + sum);
    }
}
