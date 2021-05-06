package Test.Interface;

public class Book_Main {
    public static void main(String[] args) {

        Book book = new Book("Master and Margatita", "M. Bulghakov", 2019);
        book.print();

        Printable printable = new Printable() { // анонимный внутренний класс, который реалтизует интерфейс Printable и
            // преопределяет метод Print (но не объект интерфейса  Printable)
            @Override
            public void print() {

            }
        };
    }
}