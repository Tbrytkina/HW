package Test.InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class MainInputStream {

    public static void main(String[] args) {
        String text = "Hello world!";

        try(
                FileInputStream fis = new FileInputStream("/Users/juta/Documents/text.txt")){
            System.out.printf("File size %d bytes \n", fis.available());

            byte [] buffer = new byte[fis.available()]; // заводим массив, куда мы будем считывать наши данные
            //через объект FileInputStream и говорим, что этот массив будет равен длине нашего файла
            fis.read(buffer, 0, fis.available()); //считали в массив начиная с объекта 0 количество симоволов из файла

            System.out.println("file data:");

            for(int i = 0; i<buffer.length; i++){// пробежались по массиву, куда мы считали символы из файла в цикле
                System.out.print((char)buffer[i]);// вывели каждый символ на экран, преобразовав его к типу char
            }

            /*int i;
            while ((i = fis.read()) != -1){ // считываем каждый отдельный байт в нашу переменную i и сразу же проверяем
                // остались ли байты в файле для считывания. Если их там нет, то метод read вернет число -1
                System.out.print((char) i); // конвертируем каждый байт в символ и выводим в консоль
             }*/

        }catch(IOException ex){ // ловим исключения
            System.out.println(ex.getMessage());
        }
    }
}

