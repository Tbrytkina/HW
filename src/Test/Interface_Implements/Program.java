package Test.Interface_Implements;

public class Program {
    public static void main(String[] args) {
        Printable printable = createPrintable( "Foreingn Affairs", true );
        printable.print();

        read(new Book("Java for Begginers!", "Key Horstman"));
        read(new Journal("Java Daily News!"));

    }
    static void read (Printable printable){
        printable.print();
    }
    static Printable createPrintable(String title, boolean option){
        if(option){
            return new Book(title, "Undefined");
        }else{
            return new Journal(title);
        }
    }
}
