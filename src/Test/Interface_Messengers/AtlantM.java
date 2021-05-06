package Test.Interface_Messengers;

public class AtlantM {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Viber viber = new Viber();

        Client client = new Client(telegram,viber);
        client.getMessenger().sendMessage();
        client.getMessenger().getMessage();

        client.getApplication().install();
    }
}
