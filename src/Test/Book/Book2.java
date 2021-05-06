package Test.Book;

public class Book2 {
    private String name;

    public Book2(String name) { // конструктор
        this.name = name;
    }

    public String getName() { // геттеры и сеттеры - поскольку поле name закрыто - для того, чтобы определить доступы к
        return name; // этому полю мы добавили геттеры и сеттеры (getname  и setname)
    }

    public void setName(String name) {
        this.name = name;
    }

    // определим в этом классе 2 дополнительных метода

    private static void read(Book2 b){ // в этом методе мы будем менять название книги путем вызова специального
        b.setName("Unknown book!"); // метода вызова сеттера name
    }
    private static void read(int x) {
        x = 20;
    }

    public static void main(String[] args) {
        Book2 book = new Book2("War and Peace");
        read(book); // передаем в тип read нашу, только что созданную книгу
        System.out.println(book.getName()); // выведем у нашего обьекта имя, вызвав метод getName

        int n = 10; // создадим некое число
        read(n); // передадим во второй вариант метода, который принимает в качестве параметра целое число
        System.out.println(n); // выведем на экран
    }
}
