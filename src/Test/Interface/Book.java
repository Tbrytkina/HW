package Test.Interface;

public class Book implements Printable {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Book '%s' written by %s author was printed in %d year", title, author, year);
    }
}
