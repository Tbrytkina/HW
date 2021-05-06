package Test.Interface_Printable_Implements;

public class Program {
    public static void main(String[] args) {

        Book book = new Book();
        book.print();
        book.paint();
    }
}

//  public static void main(String[] args) {
//      Printable.Printer = new Book();
//      book.print();
//  } - вариант 2
