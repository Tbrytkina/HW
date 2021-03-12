package HW_050321;

import java.util.Random;
import java.util.Arrays;

public class Task5 {

    public static void main (String[]args) {
        Random ran = new Random();
        int[] array = new int[10];
        for ( int i= 0; i< array.length; i++){
            array[i] = ran.nextInt();
            Arrays.sort(array);
        }
        System.out.println(Arrays.toString(array));
    }

}

