package Test.Interface_Printable;

public interface Printable {
    default void print(){
        System.out.println("Undefined printable");
    }
}
// void print();
// static void read(){
// System.out.println("Read printable"); - вариант 2
