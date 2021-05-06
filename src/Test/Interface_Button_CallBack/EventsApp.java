package Test.Interface_Button_CallBack;

public class EventsApp {
    public static void main(String[] args) {
        Button tvButton = new Button(new EventHandler() { /*создание анонимного класса, который реализует EventHandler и в этом анонимном классе переопределяется
        метод execute, в котором определяем следующие действия System.out.println...*/
            private boolean on = false;
            @Override
            public void execute() {
                if (on){
                    System.out.println("TV switched off");
                    on = false;
                }else{
                    System.out.println("TV switched on");
                    on = true;
                }
            }
        });

        Button printerButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Document was sent to the printer");

            }
        });
        tvButton.click();
        printerButton.click();
        tvButton.click();
        tvButton.click();
    }
}
