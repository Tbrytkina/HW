package Test.Interface_Printable_Implements;

public class Book implements Printable.Printer{

    public void paint() {
        System.out.println("Image was painted");
    }
    @Override
    public void print() {
        System.out.println("Book was printed");
    }
}
