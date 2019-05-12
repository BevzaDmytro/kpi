package decorator;

public class SenderDecorator implements MessageSender {
    protected MessageSender wrappee;

    public SenderDecorator(MessageSender sender) {
        this.wrappee = sender;
    }

    @Override
    public void send(String data) {
        this.wrappee.send(data);
    }
}
