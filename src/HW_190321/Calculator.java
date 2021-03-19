package HW_190321;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double n1 = getDouble();
        double n2 = getDouble();
        char calc = getSymbol();
        double result = answer(n1, n2, getSymbol());
        System.out.println(result);

    }

    public static double getDouble() {
        System.out.println("Введите любое число:");
        double n;
        if (scanner.hasNextDouble()) {
            n = scanner.nextDouble();
        } else {
            System.out.println("Вы ввели неверное число");
            scanner.next();
            n = getDouble();
        }
        return n;
    }

    public static char getSymbol() {
        System.out.println("Введите арифметическое действие");
        char calc;
        if(scanner.hasNext()){
            calc = scanner.next().charAt(0);
        } else {
            System.out.println("Неверное действие, попробуйте еще раз");
            scanner.next();
            calc = getSymbol();
        }
        return calc;
    }

    public static double answer(double n1, double n2, char symbol) {
        double result;
        switch (symbol){
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '*':
                result = n1*n2;
                break;
            case '/':
                result = n1/n2;
                break;
            default:
                System.out.println("Математическое действие или число введено неверно");
                result = answer(n1, n2, getSymbol());
    }
        return result;

    }
}
