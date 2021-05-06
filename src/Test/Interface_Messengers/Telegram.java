package Test.Interface_Messengers;

public class Telegram implements Messenger, Application{

    @Override
    public void sendMessage() {
        System.out.println("Send the message through Telegram");

    }

    @Override
    public void getMessage() {
        System.out.println("Read the message in Telegram");

    }

    @Override
    public void install() {
        System.out.println("Telegram has been installed to our mobile phone");
    }
}
