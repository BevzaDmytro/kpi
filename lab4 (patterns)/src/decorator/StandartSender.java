package decorator;

public class StandartSender implements MessageSender {
    @Override
    public void send(String data) {
        System.out.println("Message sent: "+data);
    }
}
