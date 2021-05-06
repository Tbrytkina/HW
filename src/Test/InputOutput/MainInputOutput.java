package Test.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainInputOutput {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("/Users/juta/Documents/text.txt")){
            FileOutputStream fos = new FileOutputStream("/Users/juta/Documents/text3.txt");
            System.out.printf("File size %d bytes \n", fis.available());

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, fis.available()); // считали строку Hello world
            fos.write(buffer, 0, buffer.length);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
