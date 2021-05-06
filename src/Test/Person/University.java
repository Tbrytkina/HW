package Test.Person;

public class University {
    public static void main(String[] args) {
        Person student = new Person("Ivan", "Ivanov", 25); // 1 способ
        student.setName("Ivan"); // 2 способ
        student.setSurname("Ivanov");
        student.setAge(25);
        System.out.println(student.getAge()); //
        System.out.println(student.getName());
        System.out.println(student.getSurname());
    }
}
