package Test.Enum;

public class EnumClass {
    public static void main(String[] args) {
        Type type = Type.INTEGER;
        System.out.println(type.parse("1"));

        // механизм рефлексии

        System.out.println(Type.class);
        System.out.println(Type.INT.getClass() + " " + Type.INT.getClass().getSuperclass());
        System.out.println(Type.INTEGER.getClass() + " " + Type.INTEGER.getClass().getSuperclass());
        System.out.println(Type.STRING.getClass() + " " + Type.STRING.getClass().getSuperclass());
    }
}
