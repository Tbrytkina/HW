package Test.Interface_Messengers;

public class WhatsApp implements Messenger, Application{
    @Override
    public void sendMessage() {
        System.out.println("Send the message through WhatsApp");

    }

    @Override
    public void getMessage() {
        System.out.println("Read the message in WhatsApp");

    }

    @Override
    public void install() {
        System.out.println("WhatsApp has been installed to our mobile phone");
    }
}
