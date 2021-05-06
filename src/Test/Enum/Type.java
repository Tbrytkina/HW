package Test.Enum;

public enum Type {
    INT(true){
        @Override
        public Object parse(String value) {
            return Integer.valueOf(value); // преобразование к типу int
        }
    },
    INTEGER(false) {
        @Override
        public Object parse(String value) {
            return Integer.valueOf(value);
        }
    },

    STRING(false) {
        @Override
        public Object parse(String value) {
            return value;
        }
    };

    boolean primitive;

    Type(boolean primitive) {
        this.primitive = primitive;
    }

    public boolean isPrimitive(){
        return primitive;
    }

    public abstract Object parse (String value); /* 3 производных класса создаются с полиморфным методом parse, который
    мы переопределяем в классах наследниках (INT, INTEGER, STRING)*/


}
