package Test.Enum_opposite;

public enum Direction {
    UP,
    DOWN;

    public Direction opposite (){
        return this == UP ? DOWN : UP;
    }
}
