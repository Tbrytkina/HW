package Test.MonitoringSystem;

public class MonitoringSystemMain {
    public static void main(String[] args) {

        MonitoringSystem generalMonitoring = new MonitoringSystem() {
            @Override // Идеешка предлагает создать анонимный класс, который реализует интерфейс MonitoringSystem,
            public void startMonitoring() { // не имеет имени и в котором мы можем преопределить метод StartMonitoring
                // нашего интерфейса MonitoringSystem. Аннотация  @Override говорит о том, что этот метод
                //StartMonitoring должен быть переопределен

                System.out.println("General monitoring module is started!");

            }
        }; // компиоятор просит поставить точку с запятой ставится для того, чтобы он понял, где именно
        // заканчивается наш анонимный класс

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Error monitoring module is started!");

            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security module is started!");
            }
        };
        generalMonitoring.startMonitoring(); // надо вызвать startMonitoring
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}// в целом создали объекты анонимных классов, которые реализуют интерфейс MonitoringSystem и успешно использовали
// объекты, вызвав у них метод startMonitoring.
