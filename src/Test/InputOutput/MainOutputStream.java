package Test.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainOutputStream {
    public static void main(String[] args) {
    String text = "Hello world!";

    try(
    //FileOutputStream fos = new FileOutputStream("/Users/juta/Documents/text.txt")){
    FileOutputStream fos = new FileOutputStream("/Users/juta/Documents/text1.txt")){
        byte [] buffer = text.getBytes(); //привели строку в последовательность byte

        fos.write(buffer[0]); // затем, с помощью write записали эту строку в файл

    }catch(IOException ex){
        System.out.println(ex.getMessage());
    }
        System.out.println("The file has been written");
    }
}
