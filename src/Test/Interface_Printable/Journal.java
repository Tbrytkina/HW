package Test.Interface_Printable;

public class Journal implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Planeta Magazine");
    }
}

