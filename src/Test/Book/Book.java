package Test.Book;

public class Book {

   private int id;
   private static int counter = 1; // static оставляет значение после кадого круга (если убрать static, тогда
    // при каждом создании объекта (книги) в этом объекте создавалась своя копия поля counter и в каждом объекте
    // это копия поля содержала бы значение 1 и соответственно, когда следующий объект изменял это поле - ведущий
    // объект, в котором была уже своя копия этого поля - этих изменений не видел. Потому что у каждого из трех обьектов
    // создалась своя копия этого поля.

   public void display (){
       System.out.printf("Id: %d\n", id);
   }

   private String author;
   private int year;
   private String name;

    public Book(String author, int year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
        id = counter++; // каждый раз при создании обьекта - значение увеличивается на 1
    }
}
