package Test.Interface_Messengers;

public class Viber implements Messenger,Application{
    @Override
    public void sendMessage() {
        System.out.println("Send the message via Viber");

    }

    @Override
    public void getMessage() {
        System.out.println("Read the message via Viber");

    }

    @Override
    public void install() {
        System.out.println("Viber has been installed to our mobile phone");
    }
}
