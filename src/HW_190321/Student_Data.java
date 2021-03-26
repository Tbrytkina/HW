package HW_190321;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student_Data {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>(); // класс динамических массивов, который может наращиваться по мере
        // надобности - класс ArrayList представляет собой списочный массив объектных ссылок переменной длины.

        list.add(new Student(2, "Alex", "Aleksandrov"));
        list.add(new Student(1, "Max", "levin"));
        list.add(new Student(2, "Alyona", "Yashina"));
        list.add(new Student(3, "Ira", "Jermakova"));
        list.add(new Student(1, "Julia", "Shishova"));
        list.add(new Student(4, "Jekaterina", "Sidorova"));
        list.add(new Student(1, "Mihhail", "Pljushenko"));
        list.add(new Student(3, "Dmitrij", "Belyi"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер курса");
        int course = scanner.nextInt();

        printList(course, list);
    }

    public static void printList(int course, List name) {
        if (!(course <= 0) && !(course >= 5)) {
            course = course;
        } else {
            System.out.println("Вы ввели неправильный курс");

        }
        System.out.println("На курсе(" + course + ") учатся следующие студенты:");
        for (Iterator iterator = name.iterator();// iterator - возврашает объект реализующий интерфейс
             iterator.hasNext(); ) { // has.next - проверка, есть ли следующий элемент и не достигнут ли конец
            // коллекции
            Student loadedStudent = (Student) iterator.next();
            if (loadedStudent.getCourse() == course)
                System.out.println(loadedStudent.getName() + " " + loadedStudent.getSurname());
            }
        }
    }