package Test.Interface_Implements;

public class Journal implements Printable{
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Journal title is: " + title);
    }
}
