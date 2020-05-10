package calculator;

public class Calculator {
    public static void main(String[] args){
        System.out.println("20 + 20 = " + add(20, 20));
        System.out.println("20 - 20 = " + subtract(20,20));
        System.out.println("20 * 20 = " + multiply(20,20));
        System.out.println("20 / 20 = " + divide(20,20));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static long multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = Double.valueOf(a)/Double.valueOf(b);
        }
        return result;
    }
}
