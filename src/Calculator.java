import jdk.dynalink.Operation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Привет, это мой пробный калькулятор!    ");
        System.out.println("Введи первое число ");
        double num1 = getNumber();
        System.out.println("Введи второе число");
        double num2 = getNumber();
        double result=0;
        System.out.println("Выбери действие +, -, *, / ");
        String action = getAction();

        switch (action) {
            case "+":
                result = add(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            case "-":
                result = substract(num1, num2);
                break;
            default:
                System.out.println("Неправильное действие, повторите попытку");
        }

        System.out.println(result);

//        double result = add(num1, num2);  // +
//        double result1 = multiply(num1, num2); // *
//        double result2 = divide(num1, num2); // /
//        double result3 = substract(num1, num2);// -
//        double result4 = sqrt(num2); // в квадрат
//        double result5 = pow(num2, 4); // в степень
//        System.out.println(result5);
    }

    public static double getNumber() {

        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public static String getAction(){
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }


    public static double add(double args, double args1) {
        return args + args1;
    }

    public static double multiply(double args, double args1) {
        return args * args1;
    }

    public static double divide(double args, double args1) {
        if (args1 == 0) {
            System.out.println("На нуль блять делить нельзя");
            return 0;
        }
        return args / args1;
    }

    public static double substract(double args, double args1) {
        return args - args1;
    }

    public static double sqrt(double args1) {
        return args1 * args1;
    }

    public static double pow(double args1, int i) {
        double result = 1.0;
        if (i <= 0) {
            for (int j = 0; j >= -i; j++) {
                result = (args1 / result);
            }

        } else {
            for (int j = 0; j <= i; j++) {
                result = (args1 * result);
            }
        }
        return result;
    }
}