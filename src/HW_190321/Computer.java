package HW_190321;

import java.util.Scanner;

public class Computer {

    private String processorType;
    private int theAmountOfRAM;
    private int volumeOfHardDisc;

    public Computer(String processorType, int theAmountOfRAM, int volumeOfHardDisc) {
        this.processorType = processorType;
        this.theAmountOfRAM = theAmountOfRAM;
        this.volumeOfHardDisc = volumeOfHardDisc;
    }

    public  void start(){
        int a, b; // а - рандомное число, загаданное компьютером
        // b - число, которое вводим с консоли

        do {
            a = (int) (Math.random() * (1 + 1)) + 1; // дает диапазон от 1 до 2
        }
        while (a == 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 или 2");
        if (scanner.hasNextInt()) {
            do {
                b = scanner.nextInt();
                if (b == a) {
                    System.out.println("Поздравляем, вы включили компьютер");
                } else {
                    System.out.println("Компьютер сгорел");
                    break;
                }
            }
            while (b!=a) ;
        }
        else System.out.println("Компьютер сгорел");
    }

    public  void end(){
        int c, d; // а - рандомное число, загаданное компьютером
        // b - число, которое вводим с консоли

        do {
            c = (int) (Math.random() * (1 + 1)) + 1; // дает диапазон от 1 до 2
        }
        while (c == 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 или 2");
        if (scanner.hasNextInt()) {
            do {
                d = scanner.nextInt();
                if (d == c) {
                    System.out.println("Поздравляем, вы выключили компьютер");
                } else {
                    System.out.println("Компьютер сгорел");
                    break;
                }
            }
            while (d!=c) ;
        }
        else System.out.println("Компьютер сгорел");
    }
} // это задание делала очень долго и конечно с подсказками из разных видео, статей и учебников.
// Не совсем понимаю, как после того, как компьютер сгорел сделать так, чтобы не давал возможности выключения и
// выводил, что ему конец

