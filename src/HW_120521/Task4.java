package HW_120521;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число больше 3");
        int n = sc.nextInt();

        while (n < 3) {
            System.out.println("Вы ввели неверное число");
            n = sc.nextInt();
        }
        System.out.println("Вы ввели " + n);
    }
} // а дальше я опять ощущаю себя чайником... впрочем, как на протяжении всей домашки )