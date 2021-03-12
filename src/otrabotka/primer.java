package otrabotka;

import java.util.Random;
import java.util.Scanner;
        public class primer {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите любое число");
                int n = sc.nextInt();
                int i;

                boolean num = false;
                for (i = 2; i < n; i++) {
                    if (n % i == 0) {
                        num = true;
                        break;
                    }
                }
                if (num) {
                    System.out.printf("Is number, %d simple - YES", n);
                } else {
                    System.out.printf("Is number, %d simple - NO", n);
                }
            }
        }
