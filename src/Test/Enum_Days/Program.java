package Test.Enum_Days;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        String nameOfDay = "MONDAY";

        if(Days.MONDAY.equals(nameOfDay));
        System.out.println(Days.MONDAY.name());

        System.out.println(Arrays.toString(Days.values()));
    }
}

/* Days monday = Days.TUESDAY;

        if(monday == Days.MONDAY){
        System.out.println(Days.MONDAY);
    }else{
            System.out.println("Incorrect day!");
        }
    }
} */
