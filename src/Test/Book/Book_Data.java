package Test.Book;

public class Book_Data {
    public static void main(String[] args) {
        Book book1 = new Book("M.Bulgakhov", 2020, "Master and Margarita");
        Book book2 = new Book("J.Osten", 2020, "Pride and prejudice");
        Book book3 = new Book("E.M. Remark", 2020, "Жизнь Взаймы");

        book3.display();
    }
}
