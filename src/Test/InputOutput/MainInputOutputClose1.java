package Test.InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class MainInputOutputClose1 {
    public static void main(String[] args) {
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("/Users/juta/Documents/text.txt"); // создаем объект и указываем путь к файлу

            int i; // промежуточная переменная, куда мы в цикле while будем записывать по 1 байту и для записи байтов
            // будем использовать метод read и тут же будем делать проверку, не достигнуи ли конец файла
            while ((i = fin.read()) != -1) {
                System.out.print((char) i); // переобразовываем целочисленные значения байтов в символьные значения
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally { // будем закрывать поток
            try {
                if (fin != null) {
                    System.out.println("\nInside finally block!");
                    fin.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
