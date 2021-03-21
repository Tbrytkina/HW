package HW_190321;

public class Student {
    private String name;
    private String surname;
    private int course;


    public Student(int course, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (!(course <= 0) && !(course >= 5)) {
            this.course = course;
        } else {
            System.out.println("Incorrect course");
        }
    }
}