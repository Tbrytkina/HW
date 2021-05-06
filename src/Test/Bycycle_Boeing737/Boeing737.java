package Test.Bycycle_Boeing737;

public class Boeing737 {

    private int productionYear; // год выпуска самолета
    private static int maxPassengersCount = 300; //статическое поле, хранит мах количество пассажиров

    public Boeing737(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getProductionYear() { // гетр, который возвращает нам значение переменной года выпуска!
        return productionYear;
    }
    public static class Drawing{ // связь между чертежом и самолетом не жесткая = самое лучшее использовать стати-
        // ческий вложенный класс (он имеет доступ даже к закрытым private членам класса обертки)
        public static int getMaxPassengersCount() {
            return maxPassengersCount;
        }
    }
}
