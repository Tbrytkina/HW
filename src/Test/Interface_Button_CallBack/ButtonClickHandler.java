package Test.Interface_Button_CallBack;

public class ButtonClickHandler implements EventHandler{

    @Override
    public void execute() {
        System.out.println("Button pressed!");

    }
}
