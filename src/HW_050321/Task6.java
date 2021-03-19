package HW_050321;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();
        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }

            System.out.print(arr[i][j]);
        }
            System.out.println();
    }
}
}