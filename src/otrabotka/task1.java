package otrabotka;

public class task1 {
        public static void main(String[] args) {
            double a = 10;
            int i;
            double n = 10;
            for(i = 1;i < 7; i++){
                n = n * 1.1;
                a += n;
            }
            System.out.println(a);
    }
}