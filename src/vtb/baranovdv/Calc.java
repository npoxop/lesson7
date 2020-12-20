package vtb.baranovdv;
//Реализовать класс Calculator, который будет содержать статические методы для операций вычитания, сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробями.

public class Calc {
    public static int minus(int a, int b) {
        int minus = a - b;
        return minus;
    }

    public static double minus(double a, double b) {
        double minus = a - b;
        return minus;
    }

    public static int plus(int a, int b) {
        int plus = a + b;
        return plus;
    }

    public static double plus(double a, double b) {
        double plus = a + b;
        return plus;
    }

    public static int division(int a, int b) {
        int division = a / b;
        return division;
    }

    public static double division(double a, double b) {
        double division = a / b;
        return division;
    }

    public static int multiplication(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    public static double multiplication(double a, double b) {
        double multiplication = a * b;
        return multiplication;
    }

    public static double procent(int a, int b) {
        int i = a / 100;
        int procent = i * b;
        return procent;
    }

    public static void main(String[] args) {
        System.out.println(minus(13.42, 21.98));
        System.out.println(plus(101, 199));
        System.out.println(division(2, 2));
        System.out.println(multiplication(76, 12));
        System.out.println(procent(200, 15));
    }
}
