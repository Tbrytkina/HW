package HW_120521;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int ameba = 1;
        Scanner ameba1 = new Scanner(System.in); //задали входной поток
        System.out.println("Введите любой номер кратный 3 и меньше 24"); // задали ввод с клавиатуры
        int n = ameba1.nextInt();

        switch (n) {
            case 3:
                for (int i = 0; i < 3; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 3 часа будет " + ameba + " амебы");
                break;
            case 6:
                for (int i = 0; i < 6; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 6 часов будет " + ameba + " амебы");
                break;
            case 9:
                for (int i = 0; i < 9; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 9 часов будет " + ameba + " амеб");
                break;

            case 12:
                for (int i = 0; i < 12; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 12 часов будет " + ameba + " амеб");
                break;

            case 15:
                for (int i = 0; i < 15; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 15 часов будет " + ameba + " амебы");
                break;

            case 18:
                for (int i = 0; i < 18; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 18 часов будет " + ameba + " амебы");
                break;

            case 21:
                for (int i = 0; i < 21; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 21 час будет " + ameba + " амеб");
                break;

            case 24:
                for (int i = 0; i < 18; i += 3) {
                    ameba *= 2;
                }
                System.out.println("Через 24 часа будет " + ameba + " амеб");
                break;

            default:
                System.out.println("Вы ввели неправильный номер");
        }
    }
}