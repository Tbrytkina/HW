package HW_090421;

import java.util.Arrays;

public class Enum_Main {
    public static void main(String[] args) {
        System.out.println(Enum_Alphabet.D.ordinal()+1);
        System.out.println(Enum_Alphabet.Y.ordinal()+1);

        System.out.println(Arrays.toString(Enum_Alphabet.values()));


       /* System.out.println(Enum_Alphabet.M.getLetterPosition()); -> Вариант 2
        System.out.println(Enum_Alphabet.Y.getLetterPosition());*/
    }
}
