package HW_050321;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        int[][] array = new int[3][5];
        Random ran = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
        }
    }
}

