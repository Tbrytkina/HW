package Test.Interface_Button_CallBack;

public class Button {
    private EventHandler eventHandler;

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void click(){
        eventHandler.execute();
    }
}