package HW_050321;

import java.util.Scanner;

public class Task2 {

    public static void main (String[] args) {

        Scanner dayweek = new Scanner(System.in); //задали входной поток
        System.out.println("Введите любой номер меньше 10"); // задали ввод с клавиатуры
        int n = dayweek.nextInt();

        if (n<10) {
            switch (n) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;

                default:
                    System.out.println("Нет такого дня недели");
            }
        }
    }
}
