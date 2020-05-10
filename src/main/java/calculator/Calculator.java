package calculator;

public class Calculator {
    public static void main(String[] args){
        System.out.println("20 + 20 = " + add(20, 20));
        System.out.println("20 - 20 = " + subtract(20,20));
        //System.out.println("6 * 3 = " + multiply(6,3));
        //System.out.println("6 / 3 = " + divide(6,3));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

}
