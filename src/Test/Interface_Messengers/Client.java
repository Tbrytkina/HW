package Test.Interface_Messengers;

public class Client {
    private Messenger messenger;
    private Application application;

    public Client(Messenger messenger, Application application) {
        this.messenger = messenger;
        this.application = application;
    }

    public Messenger getMessenger() {
        return messenger;
    }

    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
